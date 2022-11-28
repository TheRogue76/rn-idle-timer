import ExpoModulesCore

public class RnIdleTimerModule: Module {
    public func definition() -> ModuleDefinition {
        Name("RnIdleTimer")
      
        Function("setIdleTimerDisabled") { (status: Bool) -> Void in
            DispatchQueue.main.async {
                UIApplication.shared.isIdleTimerDisabled = status
            }
        }
    }
}
