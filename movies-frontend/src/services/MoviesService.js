import { axiosInstance } from 'src/boot/axios'

export const moviesService = {
  getAllMovies,
  getMoviesByYear,
  getMoviesByYearAndGenre
}

const path = '/movies'

async function getAllMovies () {
  return (await axiosInstance.get(path))
}

async function getMoviesByYear (year, params) {
  return (await axiosInstance.get(`${path}/year/${year}`, { params }))
}

async function getMoviesByYearAndGenre (year, genre, params) {
  return (await axiosInstance.get(`${path}/yearAndGenre/${year}/${genre}`, { params }))
}
