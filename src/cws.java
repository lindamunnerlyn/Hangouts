// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cws extends cwe
{

    private static final long serialVersionUID = 1L;
    public final cgd a = null;

    private cws(String s, String s1)
    {
        super(s1, s);
    }

    public static cws a(String s, String s1)
    {
        return new cws(s, s1);
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            String s1 = String.valueOf("RemoveUserRequest build protobuf convID: ");
            String s2 = c;
            String s3 = this.j;
            String s4 = String.valueOf(a);
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 36 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(s2).append(" clientGeneratedId: ").append(s3).append(" participantId: ").append(s4).toString());
        }
        izg izg1 = new izg();
        izg1.b = aow.c(this.j);
        izg1.a = cvu.a(c);
        izg1.e = Integer.valueOf(5);
        jdb jdb1 = new jdb();
        jdb1.a = izg1;
        if (a != null)
        {
            cgd cgd1 = a;
            jce jce1 = new jce();
            if (!TextUtils.isEmpty(cgd1.a))
            {
                jce1.b = cgd1.a;
            }
            if (!TextUtils.isEmpty(cgd1.b))
            {
                jce1.a = cgd1.b;
            }
            jdb1.b = jce1;
        }
        jdb1.requestHeader = cvu.a(s, i, j, h);
        return jdb1;
    }

    public String f()
    {
        return "conversations/removeuser";
    }
}
