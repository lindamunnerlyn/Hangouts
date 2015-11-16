// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public class cwn extends cvn
{

    private static final long serialVersionUID = 1L;
    private final List g = new ArrayList();

    private cwn(jbk jbk1)
    {
        jba ajba[] = jbk1.a;
        int j = ajba.length;
        for (int i = 0; i < j; i++)
        {
            jba jba1 = ajba[i];
            g.add(cey.a(jba1.c));
        }

        if (cvn.a)
        {
            jbk1 = String.valueOf(jbk1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jbk1).length() + 36)).append("GetHangoutParticipantsResponse from:").append(jbk1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jbk)kop.mergeFrom(new jbk(), abyte0);
        if (a(((jbk) (abyte0)).responseHeader))
        {
            return new cvz(((jbk) (abyte0)).responseHeader);
        } else
        {
            return new cwn(abyte0);
        }
    }

    public String k()
    {
        return ((cti)b).b;
    }

    public List l()
    {
        return g;
    }
}
