import { Switch, Route } from 'react-router-dom';
import React, { Component } from 'react';

import Home from '../pages/Home';

class Body extends Component {
  render() {
    return (
      <Switch>
        <Route exact path="/" render={() => { return <Home />; }} />
      </Switch>
    );
  }
}

export default Body;
