
import React, { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

  const [currentView, setCurrentView] = useState("book");

  let renderedComponent;
  if (currentView === "book") {
    renderedComponent = <BookDetails />;
  } else if (currentView === "blog") {
    renderedComponent = <BlogDetails />;
  } else if (currentView === "course") {
    renderedComponent = <CourseDetails />;
  } else {
    renderedComponent = <div>Select a view</div>;
  }

  return (
    <div style={{ textAlign: "center", marginTop: 40 }}>
      <h1>Blogger App</h1>
      <div style={{ marginBottom: 30 }}>
        <button onClick={() => setCurrentView("course")}>Course Details</button>
        <button onClick={() => setCurrentView("book")}>Book Details</button>
        <button onClick={() => setCurrentView("blog")}>Blog Details</button>
      </div>

      {renderedComponent}

    </div>
  );
}

export default App;