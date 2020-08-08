import React, { Component } from 'react';
import { bindActionCreators } from 'redux';
import {connect} from 'react-redux';

class Home extends Component {
  render() {
    return <h1>Home</h1>;
  }
}

function mapDispatchToProps(dispatch) {
  return bindActionCreators(Actions, dispatch);
}

function mapStateToProps(state) {
  return {
  };
}


export default connect(mapStateToProps, mapDispatchToProps)(Home);
