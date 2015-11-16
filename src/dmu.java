// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class dmu extends dmp
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String i;
    public final int j;

    protected dmu(kxc kxc, kxz kxz1)
    {
        super(kxc, null, null, null, null, "hangouts/gv_voicemail");
        i = kxz1.X;
        j = Integer.parseInt(kxz1.G);
        if (dmo.e())
        {
            kxc = i;
            int k = j;
            eev.b("Babel", (new StringBuilder(String.valueOf(kxc).length() + 57)).append("Received voicemail with media key: ").append(kxc).append(" duration: ").append(k).toString());
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
