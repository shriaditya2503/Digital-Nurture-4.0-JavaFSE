import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        const postObjects = data.map((post) => new Post(post.id, post.title, post.body));
        this.setState({ posts: postObjects });
      })
      .catch((error) => {
        this.setState({ hasError: true });
        console.error('Error fetching posts:', error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h2>Blog Posts</h2>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error);
    console.error('Error caught in componentDidCatch:', error, info);
  }
}

export default Posts;
