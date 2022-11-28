import RnIdleTimerModule from "./RnIdleTimerModule";

//  Function to disable idle timer
export function setIdleTimerDisabled(status: boolean): void {
  return RnIdleTimerModule.setIdleTimerDisabled(status);
}
