// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cuo extends cua
{

    private static final long serialVersionUID = 1L;
    public final cey a = null;

    private cuo(String s, String s1)
    {
        super(s1, s);
    }

    public static cuo a(String s, String s1)
    {
        return new cuo(s, s1);
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            String s1 = String.valueOf("RemoveUserRequest build protobuf convID: ");
            String s2 = c;
            String s3 = this.j;
            String s4 = String.valueOf(a);
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 36 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(s2).append(" clientGeneratedId: ").append(s3).append(" participantId: ").append(s4).toString());
        }
        itb itb1 = new itb();
        itb1.b = aoe.c(this.j);
        itb1.a = ctq.a(c);
        itb1.e = Integer.valueOf(5);
        iww iww1 = new iww();
        iww1.a = itb1;
        if (a != null)
        {
            cey cey1 = a;
            ivz ivz1 = new ivz();
            if (!TextUtils.isEmpty(cey1.a))
            {
                ivz1.b = cey1.a;
            }
            if (!TextUtils.isEmpty(cey1.b))
            {
                ivz1.a = cey1.b;
            }
            iww1.b = ivz1;
        }
        iww1.requestHeader = ctq.a(s, i, j, h);
        return iww1;
    }

    public String g()
    {
        return "conversations/removeuser";
    }
}
