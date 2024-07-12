
import './App.css';
//import Register from './components/Register';
import axios from 'axios';
import { useState } from 'react';
import Layout from './components/Layout';
import { Link, useNavigate } from "react-router-dom";
import Login from './components/Login';

function App() {
    return (
        <Layout/>
    );
//   const [name, setName] = useState('');
//   const [email, setEmail] = useState('');

//   const handleSubmit = async (e) => {
//       e.preventDefault();
//       try {
//         const userData={ name, email };
//         console.log(userData);
//           const response = await axios.post('http://localhost:8080/api/users/saveUser',userData);
//           console.log('User created:', response.data);
//       } catch (error) {
//           console.error('There was an error creating the user!', error);
//       }
//   };

//   return (
//       <form onSubmit={handleSubmit}>
//           <input type="text" value={name} onChange={(e) => setName(e.target.value)} placeholder="Name" />
//           <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} placeholder="Email" />
//           <button type="submit">Register</button>

//           {/* <div>
//                                 <Link to={"/register"}>
//                                     <button name={"REGISTRATION"}>REGISTRATION</button>
//                                 </Link>
//                             </div> */}
//       </form>
//   );
 
}

export default App;
