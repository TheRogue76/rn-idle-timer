# rn-idle-timer

A native module allowing you to disable and enable idle timer in Android and iOS using React Native. Supports both the old architecture and the new architecture
This is heavily inspired by @marcshilling original package https://github.com/marcshilling/react-native-idle-timer.

# API documentation

```ts
import { setIdleTimerDisabled } from "rn-idle-timer";

// To disable the idle time out, set it to true
setIdleTimerDisabled(true)

// To re-enable conformance to the idle time out, set the value to false
setIdleTimerDisabled(false)
```

### Installation
Run

```
npm install rn-idle-timer
```
or
```
yarn add rn-idle-timer
```

and run
```
cd ios && pod install && cd ..
```
To install the ios dependencies

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
