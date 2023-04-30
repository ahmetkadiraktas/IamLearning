/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    
    container:{
      center: true,
    },
    extend: {
      fontFamily: {
        mont: ['Montserrat', 'sans-serif'],
      },

      colors:{
        'siyah':'#141414',
        'kirmizi':'#fe3939',
        'beyaz':'#f9f9f9',
      },
      
    },
  },

  plugins: [],
}
