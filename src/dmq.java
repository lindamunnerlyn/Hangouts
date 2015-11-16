// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class dmq extends dmp
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String i;

    protected dmq(kxc kxc, kxz kxz1)
    {
        super(kxc, null, null, null, null, "audio/*");
        i = kxz1.X;
        if (dmo.e())
        {
            kxc = String.valueOf(i);
            if (kxc.length() != 0)
            {
                kxc = "Received audio attachment with media key: ".concat(kxc);
            } else
            {
                kxc = new String("Received audio attachment with media key: ");
            }
            eev.b("Babel", kxc);
        }
    }

    public String toString()
    {
        String s = String.valueOf(i);
        if (s.length() != 0)
        {
            return "mediaKey: ".concat(s);
        } else
        {
            return new String("mediaKey: ");
        }
    }
}
