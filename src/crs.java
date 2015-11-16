// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class crs extends crn
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String i;
    public final int j;

    protected crs(koz koz, kpw kpw1)
    {
        super(koz, null, null, null, null, "hangouts/gv_voicemail");
        i = kpw1.X;
        j = Integer.parseInt(kpw1.G);
        if (crm.d())
        {
            koz = i;
            int k = j;
            ebw.b("Babel", (new StringBuilder(String.valueOf(koz).length() + 57)).append("Received voicemail with media key: ").append(koz).append(" duration: ").append(k).toString());
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
