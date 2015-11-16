// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class gps
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private List a;

    public gps()
    {
        a = new ArrayList();
    }

    public static gpt newBuilder()
    {
        return new gpt();
    }

    public List a()
    {
        return a;
    }

    public int b()
    {
        return a.size();
    }

    public void readExternal(ObjectInput objectinput)
    {
        int j = objectinput.readInt();
        for (int i = 0; i < j; i++)
        {
            gpq gpq1 = new gpq();
            gpq1.readExternal(objectinput);
            a.add(gpq1);
        }

    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        int j = b();
        objectoutput.writeInt(j);
        for (int i = 0; i < j; i++)
        {
            ((gpq)a.get(i)).writeExternal(objectoutput);
        }

    }
}
