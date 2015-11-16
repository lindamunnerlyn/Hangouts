// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class gpo
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean a;
    private String b;
    private boolean c;
    private String d;
    private List e;
    private boolean f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;

    public gpo()
    {
        b = "";
        d = "";
        e = new ArrayList();
        g = "";
        i = false;
        k = "";
    }

    public static gpp newBuilder()
    {
        return new gpp();
    }

    public gpo a(String s)
    {
        a = true;
        b = s;
        return this;
    }

    public gpo a(boolean flag)
    {
        h = true;
        i = flag;
        return this;
    }

    public String a()
    {
        return b;
    }

    public String a(int l)
    {
        return (String)e.get(l);
    }

    public gpo b(String s)
    {
        c = true;
        d = s;
        return this;
    }

    public String b()
    {
        return d;
    }

    public int c()
    {
        return e.size();
    }

    public gpo c(String s)
    {
        f = true;
        g = s;
        return this;
    }

    public gpo d(String s)
    {
        j = true;
        k = s;
        return this;
    }

    public String d()
    {
        return g;
    }

    public boolean e()
    {
        return i;
    }

    public void readExternal(ObjectInput objectinput)
    {
        a(objectinput.readUTF());
        b(objectinput.readUTF());
        int i1 = objectinput.readInt();
        for (int l = 0; l < i1; l++)
        {
            e.add(objectinput.readUTF());
        }

        if (objectinput.readBoolean())
        {
            c(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            d(objectinput.readUTF());
        }
        a(objectinput.readBoolean());
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        objectoutput.writeUTF(b);
        objectoutput.writeUTF(d);
        int i1 = c();
        objectoutput.writeInt(i1);
        for (int l = 0; l < i1; l++)
        {
            objectoutput.writeUTF((String)e.get(l));
        }

        objectoutput.writeBoolean(f);
        if (f)
        {
            objectoutput.writeUTF(g);
        }
        objectoutput.writeBoolean(j);
        if (j)
        {
            objectoutput.writeUTF(k);
        }
        objectoutput.writeBoolean(i);
    }
}
