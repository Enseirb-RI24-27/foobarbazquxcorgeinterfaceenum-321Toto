package com.jad;

import java.util.List;

public class Foo implements IFoo {
    private IBaz baz;
    private List<IBar> bars;
    private IQux qux = new Qux();
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    private void addBar(IBar bar) {
        bars.add(bar);
    }
}
