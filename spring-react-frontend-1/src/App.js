
import './App.css';
import Appbar from './components/Appbar'//import the function and file Appbar
import Student from './components/Student'
import { createTheme, ThemeProvider } from '@material-ui/core'; 

function App() {
  const theme = createTheme({
    typography: {
    fontFamily: [
    'Pixelify Sans',
     'cursive'
     ].join(','),
    }
  });
  
  return (
    <ThemeProvider theme={theme}> {/*calling a theme*/}
    <div className="App" >
      <Appbar/> {/*call the function*/}
      <Student/>
    </div>
    </ThemeProvider>
  );
}

export default App;
