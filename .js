//comment section in react using tailwind css
//importing react and tailwind css
import React from "react";
import "./styles.css";

export default function App() {
  return (
    <div className="App">
      <h1>Hello CodeSandbox</h1>
      <h2>Start editing to see some magic happen!</h2>
      <div className="comment">
        <div className="comment__header">
          <div className="comment__author">
            <img
              className="comment__avatar"
              src="https://scontent.fktm8-1.fna.fbcdn.net/v/t1.0-9/10000000_10157038867045613_6737275973820338176_n.jpg?_nc_cat=100&_nc_sid=85a577&_nc_ohc=1ZfLcV7v5O8AX8V7b1N&_nc_ht=scontent.fktm8-1.fna&oh=5e5e2b2c0b5b7d0d1f1c9e4e4f4e0b4d&oe=5F1B1C1D"
              alt="avatar"
            />
            <div className="comment__author-name">Sushil Shrestha</div>
          </div>
          <div className="comment__time">3 hours ago</div>
        </div>
        <div className="comment__content">
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam
            rerum natus, voluptas, quod, voluptatem quidem autem ipsam
            consectetur blanditiis dolorum quia? Nihil dolores cumque, voluptas
            quibusdam dolorum quia, voluptate voluptatem repellendus quae
            sapiente, aliquam adipisci. Nemo, quod. Dolores, quae. Doloremque
            voluptates, aliquam voluptatem, doloremque dicta, cumque quod
            molestias ipsa maiores porro repellat quos natus. Ipsa, quos
            consequuntur? Harum, quibusdam. Quisquam, doloremque! Fugit, quos
            voluptatem! Quasi, nisi!
          </p>
        </div>
        <div className="comment__actionsd