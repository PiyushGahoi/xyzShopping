module.exports = {
  "extends": "airbnb",
  "parser": "babel-eslint",
  "env": {
    "browser": true
  },
  "plugins": [
    "react",
    "jsx-a11y",
    "import"
  ],
  "parserOptions": {
    "ecmaVersion": 6,
    "sourceType": "module",
    "ecmaFeatures": {
      "jsx": true
    }
  },
  "rules": {
    "react/jsx-filename-extension": [1, { "extensions": [".js", ".jsx"] }],
    "react/prefer-stateless-function": 0,
    "react/prop-types": 0,
    "no-underscore-dangle": 0,
    "func-names": 0,
    "arrow-body-style": [2, "always"],
    "prefer-destructuring": 0,
    "no-console": 1,
    "max-len": ["error", { "code": 150, "ignoreComments": true }],
    "linebreak-style":0,
    "react/destructuring-assignment": 0,
    "jsx-a11y/click-events-have-key-events": 0, // this is good for disabled people, let's ignore this for now
    "jsx-a11y/no-noninteractive-element-interactions": 0, // this one too
  }
};
