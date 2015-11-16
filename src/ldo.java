// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class ldo extends lev
{

    private static final long serialVersionUID = 0xc1cfd7268213a8c7L;
    private ldn a;
    private lcy b;

    ldo(ldn ldn1, lcy lcy1)
    {
        a = ldn1;
        b = lcy1;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        a = (ldn)objectinputstream.readObject();
        b = ((lcz)objectinputstream.readObject()).a(a.c());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(a);
        objectoutputstream.writeObject(b.a());
    }

    public lcy a()
    {
        return b;
    }

    public ldn a(int i)
    {
        a.a(a().b(a.b(), i));
        return a;
    }

    protected long b()
    {
        return a.b();
    }

    protected lcw c()
    {
        return a.c();
    }
}
