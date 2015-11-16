// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class lny extends lpf
{

    private static final long serialVersionUID = 0xc1cfd7268213a8c7L;
    private lnx a;
    private lni b;

    lny(lnx lnx1, lni lni1)
    {
        a = lnx1;
        b = lni1;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        a = (lnx)objectinputstream.readObject();
        b = ((lnj)objectinputstream.readObject()).a(a.b());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(a);
        objectoutputstream.writeObject(b.a());
    }

    public lni a()
    {
        return b;
    }

    public lnx a(int i)
    {
        a.a(a().b(a.a(), i));
        return a;
    }

    protected long b()
    {
        return a.a();
    }

    protected lng c()
    {
        return a.b();
    }
}
