import { axiosInstance } from 'src/boot/axios'

export const ratingsService = {
  getAllRatings,
  getRatedMoviesByTop
}

const path = '/ratings'

async function getAllRatings () {
  return (await axiosInstance.get(path))
}

async function getRatedMoviesByTop (limit) {
  return (await axiosInstance.get(`${path}/byTop/${limit}`))
}
