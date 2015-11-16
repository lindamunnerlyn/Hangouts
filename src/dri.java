// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class dri
{

    public static final boolean a = false;

    public static acv a(Context context, byte abyte0[], String s)
    {
        if (a)
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "MmsTransaction.retrieveMessage: ".concat(s1);
            } else
            {
                s1 = new String("MmsTransaction.retrieveMessage: ");
            }
            ebw.b("Babel_SMS", s1);
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("MmsTransactions: retrieve: empty URL");
        }
        if (drk.d())
        {
            return ((dqy)hgx.a(context, dqy)).a(context, abyte0, s);
        } else
        {
            return b(context, abyte0, s);
        }
    }

    private static drj a(Context context, acx acx1)
    {
        if (a)
        {
            ebw.b("Babel_SMS", "MmsTransactions.sendSendReq");
            String s = String.valueOf(acx1.c().c());
            acc aacc[];
            int i;
            int j;
            if (s.length() != 0)
            {
                s = "====> from=".concat(s);
            } else
            {
                s = new String("====> from=");
            }
            ebw.b("Babel_SMS", s);
            aacc = acx1.e();
            j = aacc.length;
            i = 0;
            while (i < j) 
            {
                s = String.valueOf(aacc[i].c());
                if (s.length() != 0)
                {
                    s = "====> to=".concat(s);
                } else
                {
                    s = new String("====> to=");
                }
                ebw.b("Babel_SMS", s);
                i++;
            }
            long l = acx1.f();
            ebw.b("Babel_SMS", (new StringBuilder(31)).append("====> size=").append(l).toString());
            i = acx1.d().b();
            ebw.b("Babel_SMS", (new StringBuilder(23)).append("====> parts=").append(i).toString());
        }
        if (drk.d())
        {
            return new drj(acx1, ((drf)hgx.a(context, drf)).a(context, acx1));
        } else
        {
            return b(context, acx1);
        }
    }

    public static drj a(Context context, String as[], String s, String s1, long l)
    {
        gbh.b(context);
        if (as == null || as.length <= 0)
        {
            throw new IllegalArgumentException("MmsTransactions: send: no recipient");
        }
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("MmsTransactions: forwardMessage: no mms uri");
        }
        acx acx1;
        try
        {
            acx1 = new acx();
            String s2 = add.a(context);
            if (!TextUtils.isEmpty(s2))
            {
                acx1.a(new acc(s2));
            }
            as = acc.a(as);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dra("Fail to create forward SendReq", context);
        }
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        acx1.a(as);
        if (!TextUtils.isEmpty(s))
        {
            acx1.b(new acc(s));
        }
        acx1.a(l / 0xf4240L);
        as = drk.a(context, s1);
        if (((drn) (as)).a <= 0)
        {
            as.a = 1048;
        }
        acx1.a(((drn) (as)).b);
        acx1.c(((drn) (as)).a);
        acx1.a("personal".getBytes());
        acx1.b(0x93a80L);
        acx1.c(129);
        acx1.d(129);
        acx1.e(129);
        return a(context, acx1);
    }

    public static drj a(Context context, String as[], String s, String s1, String s2, String s3, int i, int j, 
            int k, long l)
    {
        gbh.b(context);
        if (as == null || as.length <= 0)
        {
            throw new IllegalArgumentException("MmsTransactions: send: no recipient");
        }
        if (TextUtils.isEmpty(s) && TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2))
        {
            throw new IllegalArgumentException("MmsTransactions: send: no content (subject or text or image)");
        }
        Object aobj[] = new String[as.length];
        int i1 = 0;
        while (i1 < as.length) 
        {
            String s4 = as[i1];
            if (bhj.a(as[i1]))
            {
                aobj[i1] = s4;
            } else
            {
                aobj[i1] = a(s4);
            }
            i1++;
        }
        as = new acx();
        String s5 = add.a(context);
        if (!TextUtils.isEmpty(s5))
        {
            as.a(new acc(s5));
        }
        aobj = acc.a(((String []) (aobj)));
        if (aobj != null)
        {
            as.a(((acc []) (aobj)));
        }
        if (!TextUtils.isEmpty(s))
        {
            as.b(new acc(s));
        }
        as.a(l / 0xf4240L);
        s = drk.a(context, s1, s2, s3, i, j, k);
        if (((drn) (s)).a <= 0)
        {
            throw new IllegalArgumentException("MmsTransactions: send: zero size body");
        } else
        {
            as.a(((drn) (s)).b);
            as.c(((drn) (s)).a);
            as.a("personal".getBytes());
            as.b(0x93a80L);
            as.c(129);
            as.d(129);
            as.e(129);
            return a(context, ((acx) (as)));
        }
    }

    private static String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        for (int i = 0; i < j; i++)
        {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '+' || c == '*' || c == '#')
            {
                stringbuilder.append(c);
            }
        }

        return stringbuilder.toString();
    }

    private static void a(Context context, dsj dsj, byte abyte0[], String s, int i)
    {
        if (a)
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "MmsTransaction.sendNotifyResponse: ".concat(s1);
            } else
            {
                s1 = new String("MmsTransaction.sendNotifyResponse: ");
            }
            ebw.b("Babel_SMS", s1);
        }
        abyte0 = new acg(abyte0, i);
        if (!dqv.a().s())
        {
            s = null;
        }
        drb.a(context, dsj, abyte0, s);
    }

    private static acv b(Context context, byte abyte0[], String s)
    {
        Object obj;
        acd acd;
        if (a)
        {
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "MmsTransaction.downloadMmsViaMmsSendReceiveManager: ".concat(((String) (obj)));
            } else
            {
                obj = new String("MmsTransaction.downloadMmsViaMmsSendReceiveManager: ");
            }
            ebw.b("Babel_SMS", ((String) (obj)));
        }
        obj = drb.a(context);
        acd = drb.a(context, ((dsj) (obj)), s);
        if (acd != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        throw new dra(137, "MmsTransactions: retrieve: get empty or invalid response");
        abyte0;
        drb.b(context);
        throw abyte0;
        if (!(acd instanceof acv))
        {
            a(context, ((dsj) (obj)), abyte0, s, 132);
            throw new drh("MmsTransactions: retrieve: get invalid response type");
        }
        a(context, ((dsj) (obj)), abyte0, s, 129);
        abyte0 = (acv)acd;
        drb.b(context);
        return abyte0;
    }

    private static drj b(Context context, acx acx1)
    {
        if (a)
        {
            ebw.b("Babel_SMS", "MmsTransactions.sendSendReqViaMmsSendReceiveManager");
        }
        Object obj = drb.a(context, drb.a(context), acx1, null);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        try
        {
            throw new drh("MmsTransactions: send: get empty response");
        }
        // Misplaced declaration of an exception variable
        catch (acx acx1) { }
        finally
        {
            drb.b(context);
        }
        throw new drh(acx1);
        throw acx1;
        int i;
        if (!(obj instanceof acw))
        {
            throw new drh("MmsTransactions: send: get invalid response type");
        }
        obj = (acw)obj;
        i = ((acw) (obj)).e();
        if (i == 128) goto _L2; else goto _L1
_L1:
        ebw.g("Babel_SMS", (new StringBuilder(31)).append("MMS error, status = ").append(i).toString());
          goto _L2
_L3:
        throw new drh("MmsTransactions: send: resp error");
_L4:
        acx1 = new drj(acx1, ((acw) (obj)));
        drb.b(context);
        return acx1;
_L5:
        throw new dra(119, "mms error response");
_L7:
        throw new dra(128, "mms error response");
_L9:
        throw new dra(127, "mms error response");
_L11:
        throw new dra(129, "mms error response");
_L8:
        throw new dra(125, "mms error response");
_L10:
        throw new dra(126, "mms error response");
_L6:
        throw new dra(124, "mms error response");
_L12:
        throw new dra(130, "mms error response");
_L13:
        throw new dra(131, "mms error response");
_L14:
        throw new dra(132, "mms error response");
_L15:
        throw new dra(133, "mms error response");
_L2:
        i;
        JVM INSTR lookupswitch 23: default 492
    //                   128: 133
    //                   129: 149
    //                   130: 229
    //                   131: 162
    //                   132: 203
    //                   133: 176
    //                   134: 216
    //                   135: 189
    //                   136: 242
    //                   193: 203
    //                   194: 176
    //                   224: 149
    //                   225: 229
    //                   226: 162
    //                   227: 203
    //                   228: 176
    //                   229: 189
    //                   230: 256
    //                   231: 256
    //                   232: 256
    //                   233: 256
    //                   234: 270
    //                   235: 284;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L8 _L9 _L5 _L6 _L7 _L8 _L9 _L11 _L13 _L13 _L13 _L13 _L14 _L15
    }

    static 
    {
        hik hik = ebw.r;
    }
}
