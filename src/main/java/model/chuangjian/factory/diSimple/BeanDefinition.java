package model.chuangjian.factory.diSimple;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 7:35 上午
 */
@Data
public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public boolean isSingleton(){
        return scope.equals(Scope.SINGLETON);
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public void setLazyInit(Boolean lazyInit) {
        this.lazyInit = lazyInit;
    }
    public String getId() {
        return id;
    }
    public String getClassName() {
        return className;
    }
    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void addConstructorArg(ConstructorArg constructorArg) {
        this.constructorArgs.add(constructorArg);
    }


    public static enum Scope{
        SINGLETON,
        PROTOTYPE
    }

    @Data
    public static class ConstructorArg{
        private boolean isRef;
        private Class type;
        private Object arg;

        private ConstructorArg(Builder builder) {
            this.isRef = builder.getIsRef();
            this.type = builder.getType();
            this.arg = builder.getArg();
        }

        public static class Builder {
            private boolean isRef = false;
            private Class type;
            private Object arg;

            public Builder setRef(Boolean isRef) {
                this.isRef = isRef;
                return this;
            }

            public Builder setType(Class type) {
                this.type = type;
                return this;
            }

            public Builder setArg(Object arg) {
                this.arg = arg;
                return this;
            }

            public ConstructorArg build() {
                if (this.isRef) {
                    if (this.type != null) {
                        throw new IllegalArgumentException("当参数为引用类型时，无需设置 type 参数");
                    }

                    // null 是 string 实例妈？
                    if (!(arg instanceof String)) {
                        throw new IllegalArgumentException("请设置引用 ID");
                    }
                } else {
                    if (this.type == null || this.arg == null) {
                        throw new IllegalArgumentException("当参数为非引用类型时，type 和 arg 参数必填");
                    }
                }

                return new ConstructorArg(this);
            }

            // Getter
            public boolean getIsRef() {
                return isRef;
            }

            public Class getType() {
                return type;
            }

            public Object getArg() {
                return arg;
            }
        }

        public boolean isRef() {
            return isRef;
        }
        public Class getType() {
            return type;
        }
        public Object getArg() {
            return arg;
        }
    }
}
