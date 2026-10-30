package com.gestorinventario.GetInv;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class FiltroCors implements Filter  {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException, ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;

        // 1. 🔥 EL TRUCO MÁGICO: Leemos exactamente qué origen mandó el navegador (localhost o 127.0.0.1)
        String origin = request.getHeader("Origin");

        // Si el origen no es nulo, se lo regresamos dinámicamente aprobado
        if (origin != null) {
            response.setHeader("Access-Control-Allow-Origin", origin);
        } else {
            // Por si acaso, si viene vacío le dejamos el por defecto
            response.setHeader("Access-Control-Allow-Origin", "http://localhost:5173");
        }

        // 2. Aprobamos los métodos y las cabeceras que pide Vite
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600"); // Cachea la respuesta por una hora para que no moleste más

        // 3. Si es el OPTIONS del Preflight, respondemos OK de inmediato
        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            // Si es tu GET o POST real, continúa hacia el controlador
            chain.doFilter(req, res);
        }
    }

}
