// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class duc
{

    public static final boolean a = false;

    public static acx a(Context context, byte abyte0[], String s)
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
            eev.b("Babel_SMS", s1);
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("MmsTransactions: retrieve: empty URL");
        }
        if (due.a(context))
        {
            return ((dts)hlp.a(context, dts)).a(context, abyte0, s);
        } else
        {
            return b(context, abyte0, s);
        }
    }

    private static dud a(Context context, acz acz1)
    {
        if (a)
        {
            eev.b("Babel_SMS", "MmsTransactions.sendSendReq");
            String s = String.valueOf(acz1.c().c());
            ace aace[];
            int i;
            int j;
            if (s.length() != 0)
            {
                s = "====> from=".concat(s);
            } else
            {
                s = new String("====> from=");
            }
            eev.b("Babel_SMS", s);
            aace = acz1.e();
            j = aace.length;
            i = 0;
            while (i < j) 
            {
                s = String.valueOf(aace[i].c());
                if (s.length() != 0)
                {
                    s = "====> to=".concat(s);
                } else
                {
                    s = new String("====> to=");
                }
                eev.b("Babel_SMS", s);
                i++;
            }
            long l = acz1.f();
            eev.b("Babel_SMS", (new StringBuilder(31)).append("====> size=").append(l).toString());
            i = acz1.d().b();
            eev.b("Babel_SMS", (new StringBuilder(23)).append("====> parts=").append(i).toString());
        }
        if (due.a(context))
        {
            return new dud(acz1, ((dtz)hlp.a(context, dtz)).a(context, acz1));
        } else
        {
            return b(context, acz1);
        }
    }

    public static dud a(Context context, String as[], String s, String s1, long l)
    {
        gdv.b("Expected non-null", context);
        if (as == null || as.length <= 0)
        {
            throw new IllegalArgumentException("MmsTransactions: send: no recipient");
        }
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("MmsTransactions: forwardMessage: no mms uri");
        }
        acz acz1;
        try
        {
            acz1 = new acz();
            String s2 = adf.a(context);
            if (!TextUtils.isEmpty(s2))
            {
                acz1.a(new ace(s2));
            }
            as = ace.a(as);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dtu("Fail to create forward SendReq", context);
        }
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        acz1.a(as);
        if (!TextUtils.isEmpty(s))
        {
            acz1.b(new ace(s));
        }
        acz1.a(l / 0xf4240L);
        as = due.a(context, s1);
        if (((duh) (as)).a <= 0)
        {
            as.a = 1048;
        }
        acz1.a(((duh) (as)).b);
        acz1.c(((duh) (as)).a);
        acz1.a("personal".getBytes());
        acz1.b(0x93a80L);
        acz1.c(129);
        acz1.d(129);
        acz1.e(129);
        return a(context, acz1);
    }

    public static dud a(Context context, String as[], String s, String s1, String s2, String s3, int i, int j, 
            int k, long l)
    {
        gdv.b("Expected non-null", context);
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
            if (bhv.a(as[i1]))
            {
                aobj[i1] = s4;
            } else
            {
                aobj[i1] = a(s4);
            }
            i1++;
        }
        as = new acz();
        String s5 = adf.a(context);
        if (!TextUtils.isEmpty(s5))
        {
            as.a(new ace(s5));
        }
        aobj = ace.a(((String []) (aobj)));
        if (aobj != null)
        {
            as.a(((ace []) (aobj)));
        }
        if (!TextUtils.isEmpty(s))
        {
            as.b(new ace(s));
        }
        as.a(l / 0xf4240L);
        s = due.a(context, s1, s2, s3, i, j, k);
        if (((duh) (s)).a <= 0)
        {
            throw new IllegalArgumentException("MmsTransactions: send: zero size body");
        } else
        {
            as.a(((duh) (s)).b);
            as.c(((duh) (s)).a);
            as.a("personal".getBytes());
            as.b(0x93a80L);
            as.c(129);
            as.d(129);
            as.e(129);
            return a(context, ((acz) (as)));
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

    private static void a(Context context, dvc dvc, byte abyte0[], String s, int i)
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
            eev.b("Babel_SMS", s1);
        }
        abyte0 = new aci(abyte0, i);
        if (!dtp.a().s())
        {
            s = null;
        }
        dtv.a(context, dvc, abyte0, s);
    }

    private static acx b(Context context, byte abyte0[], String s)
    {
        Object obj;
        acf acf;
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
            eev.b("Babel_SMS", ((String) (obj)));
        }
        obj = dtv.a(context);
        acf = dtv.a(context, ((dvc) (obj)), s);
        if (acf != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        throw new dtu(137, "MmsTransactions: retrieve: get empty or invalid response");
        abyte0;
        dtv.b(context);
        throw abyte0;
        if (!(acf instanceof acx))
        {
            a(context, ((dvc) (obj)), abyte0, s, 132);
            throw new dub("MmsTransactions: retrieve: get invalid response type");
        }
        a(context, ((dvc) (obj)), abyte0, s, 129);
        abyte0 = (acx)acf;
        dtv.b(context);
        return abyte0;
    }

    private static dud b(Context context, acz acz1)
    {
        if (a)
        {
            eev.b("Babel_SMS", "MmsTransactions.sendSendReqViaMmsSendReceiveManager");
        }
        Object obj = dtv.a(context, dtv.a(context), acz1, null);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        try
        {
            throw new dub("MmsTransactions: send: get empty response");
        }
        // Misplaced declaration of an exception variable
        catch (acz acz1) { }
        finally
        {
            dtv.b(context);
        }
        throw new dub(acz1);
        throw acz1;
        int i;
        if (!(obj instanceof acy))
        {
            throw new dub("MmsTransactions: send: get invalid response type");
        }
        obj = (acy)obj;
        i = ((acy) (obj)).e();
        if (i == 128) goto _L2; else goto _L1
_L1:
        eev.g("Babel_SMS", (new StringBuilder(31)).append("MMS error, status = ").append(i).toString());
          goto _L2
_L3:
        throw new dub("MmsTransactions: send: resp error");
_L4:
        acz1 = new dud(acz1, ((acy) (obj)));
        dtv.b(context);
        return acz1;
_L5:
        throw new dtu(119, "mms error response");
_L7:
        throw new dtu(128, "mms error response");
_L9:
        throw new dtu(127, "mms error response");
_L11:
        throw new dtu(129, "mms error response");
_L8:
        throw new dtu(125, "mms error response");
_L10:
        throw new dtu(126, "mms error response");
_L6:
        throw new dtu(124, "mms error response");
_L12:
        throw new dtu(130, "mms error response");
_L13:
        throw new dtu(131, "mms error response");
_L14:
        throw new dtu(132, "mms error response");
_L15:
        throw new dtu(133, "mms error response");
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
        hnc hnc = eev.r;
    }
}
