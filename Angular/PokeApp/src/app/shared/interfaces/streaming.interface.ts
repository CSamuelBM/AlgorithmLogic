export interface StreamingData {
  typee: string;
  title: string;
  director: string;
  castt: string;
  country: string;
  dateAdded: string;
  releaseYear: string;
  rating: string;
  duration: string;
  listedIn: string;
  description: string;
}

export interface StreamingAll {
  content: Array<{
    typee: string;
    title: string;
    director: string;
    castt: string;
    country: string;
    dateAdded: string;
    releaseYear: string;
    rating: string;
    duration: string;
    listedIn: string;
    description: string;
  }>;
  page: {
    size: number;
    numberPage: number;
    totalElements: number;
    totalPage: number;
  };
}
