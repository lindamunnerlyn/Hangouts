// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class cro extends crn
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String i;

    protected cro(koz koz, kpw kpw1)
    {
        super(koz, null, null, null, null, "audio/*");
        i = kpw1.X;
        if (crm.d())
        {
            koz = String.valueOf(i);
            if (koz.length() != 0)
            {
                koz = "Received audio attachment with media key: ".concat(koz);
            } else
            {
                koz = new String("Received audio attachment with media key: ");
            }
            ebw.b("Babel", koz);
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
