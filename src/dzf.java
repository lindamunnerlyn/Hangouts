// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class dzf extends Exception
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public Intent a;
    public int b;

    public dzf(int i)
    {
        a = null;
        b = i;
    }

    public dzf(Intent intent)
    {
        a = intent;
        b = 0;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        b = objectinputstream.readInt();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeInt(b);
    }
}
