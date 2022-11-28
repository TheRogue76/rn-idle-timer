import { useState } from "react";
import { StyleSheet, Text, View, Pressable } from "react-native";
import { setIdleTimerDisabled } from "rn-idle-timer";

export default function App() {
  const [status, setStatus] = useState<boolean>(false);

  return (
    <View style={styles.container}>
      <Pressable
        onPress={() => {
          setIdleTimerDisabled(!status);
          setStatus(!status);
        }}
      >
        <Text>{`Press me to change state to : ${!status}`}</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
});
