#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface CheckboxRebornViewManager : RCTViewManager
@end

@implementation CheckboxRebornViewManager

RCT_EXPORT_MODULE(CheckboxRebornView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
