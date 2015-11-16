// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class glm
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private List a;

    public glm()
    {
        a = new ArrayList();
    }

    public static gln newBuilder()
    {
        return new gln();
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
            glk glk1 = new glk();
            glk1.readExternal(objectinput);
            a.add(glk1);
        }

    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        int j = b();
        objectoutput.writeInt(j);
        for (int i = 0; i < j; i++)
        {
            ((glk)a.get(i)).writeExternal(objectoutput);
        }

    }
}
