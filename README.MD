# rn-idle-timer

A native module allowing you to disable and enable idle timer in Android and iOS using React Native. Supports both the old architecture and the new architecture

# API documentation

```ts
import { setIdleTimerDisabled } from "rn-idle-timer";

// To disable the idle time out, set it to true
setIdleTimerDisabled(true)

// To re-enable conformance to the idle time out, set the value to false
setIdleTimerDisabled(false)
```

# Installation in managed Expo projects

For [managed](https://docs.expo.dev/versions/latest/introduction/managed-vs-bare/) Expo projects, please follow the installation instructions in the [API documentation for the latest stable release](#api-documentation). If you follow the link and there is no documentation available then this library is not yet usable within managed projects &mdash; it is likely to be included in an upcoming Expo SDK release.

# Installation in bare React Native projects

For bare React Native projects, you must ensure that you have [installed and configured the `expo` package](https://docs.expo.dev/bare/installing-expo-modules/) before continuing.

### Add the package to your npm dependencies

```
npm install rn-idle-timer
```

### Configure for iOS

Run `npx pod-install` after installing the npm package.


### Configure for Android

None

# Contributing

Contributions are very welcome! Please refer to guidelines described in the [contributing guide]( https://github.com/expo/expo#contributing).
