// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class glo
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean a;
    private String b;
    private boolean c;
    private String d;
    private boolean e;
    private String f;

    public glo()
    {
        b = "";
        d = "";
        f = "";
    }

    public static glp newBuilder()
    {
        return new glp();
    }

    public glo a(String s)
    {
        a = true;
        b = s;
        return this;
    }

    public String a()
    {
        return b;
    }

    public glo b(String s)
    {
        c = true;
        d = s;
        return this;
    }

    public String b()
    {
        return d;
    }

    public glo c(String s)
    {
        e = true;
        f = s;
        return this;
    }

    public void readExternal(ObjectInput objectinput)
    {
        if (objectinput.readBoolean())
        {
            a(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            b(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            c(objectinput.readUTF());
        }
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        objectoutput.writeBoolean(a);
        if (a)
        {
            objectoutput.writeUTF(b);
        }
        objectoutput.writeBoolean(c);
        if (c)
        {
            objectoutput.writeUTF(d);
        }
        objectoutput.writeBoolean(e);
        if (e)
        {
            objectoutput.writeUTF(f);
        }
    }
}
