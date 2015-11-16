// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;

public class cxt extends cvn
{

    private static final long serialVersionUID = 2L;
    private final String g;
    private final long h;
    private final String i[];
    private final String j[];
    private final String k[];
    private final String l[];
    private final byte m[];
    private boolean n;
    private final long o;

    private cxt(ixo ixo1)
    {
        super(ixo1.responseHeader, g.a(ixo1.c.c, 0L));
        g = ixo1.c.d;
        h = g.a(ixo1.c.n, 0L);
        int k1 = ixo1.b.length;
        j = new String[k1];
        k = new String[k1];
        l = new String[k1];
        i = new String[k1];
        o = g.a(ixo1.responseHeader.d, 0L);
        int i1;
        if (ixo1.c.e != null && ixo1.c.e.d != null)
        {
            m = kop.toByteArray(ixo1.c.e.d);
        } else
        {
            m = null;
        }
        i1 = 0;
label0:
        do
        {
            if (i1 < k1)
            {
                kqp kqp1 = (kqp)ixo1.b[i1].a.a.getExtension(kqp.a);
                j[i1] = kqp1.e;
                k[i1] = kqp1.d;
                l[i1] = kqp1.h;
                int l1 = kqp1.f.length;
                int j1 = 0;
                do
                {
label1:
                    {
                        if (j1 < l1)
                        {
                            String s1 = kqp1.f[j1];
                            if (!s1.startsWith("BABEL_UNIQUE_ID"))
                            {
                                break label1;
                            }
                            i[i1] = s1;
                        }
                        i1++;
                        continue label0;
                    }
                    j1++;
                } while (true);
            }
            if (cvn.a)
            {
                ixo1 = String.valueOf(ixo1);
                ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ixo1).length() + 29)).append("SendChatMessageResponse from:").append(ixo1).toString());
            }
            return;
        } while (true);
    }

    public static cvn parseFrom(ixo ixo1)
    {
        if (a(ixo1.responseHeader))
        {
            return new cvz(ixo1.responseHeader);
        } else
        {
            return new cxt(ixo1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((ixo)kop.mergeFrom(new ixo(), abyte0));
    }

    public void a(aoe aoe1, dfb dfb)
    {
        String s1;
        Object obj;
        Object obj1;
        long l2 = SystemClock.elapsedRealtime();
        super.a(aoe1, dfb);
        s1 = k();
        obj = (cut)b;
        obj1 = ((cut) (obj)).j;
        if (cvn.a)
        {
            dfb = g;
            long l3 = d;
            int i1 = j.length;
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 157 + String.valueOf(dfb).length() + String.valueOf(obj1).length())).append("processSendChatMessageResponse Conversation id: ").append(s1).append(", messageId: ").append(dfb).append(", messageTimestamp: ").append(l3).append(", messageClientGeneratedId: ").append(((String) (obj1))).append(", mediaId count: ").append(i1).toString());
            String as[] = j;
            int i2 = as.length;
            i1 = 0;
            while (i1 < i2) 
            {
                dfb = String.valueOf(as[i1]);
                if (dfb.length() != 0)
                {
                    dfb = "  photoId ".concat(dfb);
                } else
                {
                    dfb = new String("  photoId ");
                }
                ebw.b("Babel", dfb);
                i1++;
            }
            as = k;
            i2 = as.length;
            i1 = 0;
            while (i1 < i2) 
            {
                dfb = String.valueOf(as[i1]);
                if (dfb.length() != 0)
                {
                    dfb = "  albumId ".concat(dfb);
                } else
                {
                    dfb = new String("  albumId ");
                }
                ebw.b("Babel", dfb);
                i1++;
            }
        }
        if (cvn.a)
        {
            String s2 = ((cut) (obj)).e();
            if (s2 != null)
            {
                dfb = String.valueOf("Stress message sent successful update message state:");
                s2 = String.valueOf(s2);
                String as1[];
                String s4;
                int j1;
                int j2;
                long l4;
                long l5;
                if (s2.length() != 0)
                {
                    dfb = dfb.concat(s2);
                } else
                {
                    dfb = new String(dfb);
                }
                ebw.b("Babel_Stress", dfb);
            }
        }
        aoe1.a();
        l4 = SystemClock.elapsedRealtime();
        if (cvn.a)
        {
            ebw.b("Babel", "modifying database");
        }
        dfb = aoe1.f(s1, ((String) (obj1)));
        if (dfb == null) goto _L2; else goto _L1
_L1:
        if (dfb != null) goto _L4; else goto _L3
_L3:
        dfb = String.valueOf("Received SendChatMessageResponse for nonexistant  clientGeneratedId  = ");
        s2 = m();
        ebw.g("Babel", (new StringBuilder(String.valueOf(dfb).length() + 14 + String.valueOf(obj1).length() + String.valueOf(s2).length())).append(dfb).append(((String) (obj1))).append(" /  eventId = ").append(s2).toString());
_L9:
        dfb = m;
        if (dfb == null)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        djc.a(((izb)kop.mergeFrom(new izb(), m)).a, s1, g, d, aoe1);
_L14:
        l5 = SystemClock.elapsedRealtime();
        j1 = aoe1.f().h();
        dfb = (new byy()).b(((String) (obj1))).a(s1);
        h.a(j1, l2, 10, dfb.a(204));
        h.a(j1, l4, 10, dfb.a(103));
        h.a(j1, l5, 13, dfb.a(0));
        aoe1.b();
        aoe1.c();
        if (!cvn.a) goto _L6; else goto _L5
_L5:
        obj1 = aoe1.e().a("messages", null, "message_id=? OR message_id=?", new String[] {
            l(), m()
        }, null);
        dfb = String.valueOf("SendChatMessage.processResponse after endTransaction  cursor count is ");
        j1 = ((Cursor) (obj1)).getCount();
        ebw.b("Babel", (new StringBuilder(String.valueOf(dfb).length() + 11)).append(dfb).append(j1).toString());
        if (!((Cursor) (obj1)).moveToFirst()) goto _L8; else goto _L7
_L7:
        as1 = ((Cursor) (obj1)).getColumnNames();
        j2 = as1.length;
        for (j1 = 0; j1 < j2; j1++)
        {
            s4 = as1[j1];
            s1 = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex(s4));
            dfb = s1;
            if (s4.equals("text"))
            {
                dfb = ebw.b(s1);
            }
            ebw.b("Babel", (new StringBuilder(String.valueOf(s4).length() + 5 + String.valueOf(dfb).length())).append(s4).append(" ==> ").append(dfb).toString());
        }

        continue; /* Loop/switch isn't completed */
_L2:
        dfb = aoe1.f(s1, m());
        continue; /* Loop/switch isn't completed */
_L4:
        aoe1.a(s1, g.a(dfb, 0L), g.a(Long.valueOf(d), 0L), g.a(Long.valueOf(h), 0L));
        aoe1.a(s1, g.a(Long.valueOf(d), 0L), g.a(dfb, 0L));
        aoe1.a(this);
        aoe1.h(s1, g.a(Long.valueOf(d), 0L));
        any.d(aoe1, s1);
          goto _L9
        Exception exception;
        exception;
        aoe1.c();
        if (!cvn.a) goto _L11; else goto _L10
_L10:
        obj = aoe1.e().a("messages", null, "message_id=? OR message_id=?", new String[] {
            l(), m()
        }, null);
        aoe1 = String.valueOf("SendChatMessage.processResponse after endTransaction  cursor count is ");
        int k1 = ((Cursor) (obj)).getCount();
        ebw.b("Babel", (new StringBuilder(String.valueOf(aoe1).length() + 11)).append(aoe1).append(k1).toString());
        if (!((Cursor) (obj)).moveToFirst()) goto _L13; else goto _L12
_L12:
        obj1 = ((Cursor) (obj)).getColumnNames();
        int k2 = obj1.length;
        for (int l1 = 0; l1 < k2; l1++)
        {
            String s3 = obj1[l1];
            dfb = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(s3));
            aoe1 = dfb;
            if (s3.equals("text"))
            {
                aoe1 = ebw.b(dfb);
            }
            ebw.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 5 + String.valueOf(aoe1).length())).append(s3).append(" ==> ").append(aoe1).toString());
        }

        continue; /* Loop/switch isn't completed */
        dfb;
        ebw.g("Babel", "Invalid ClientSuggestions protobuf parsed from ClientSendChatMessageResponse. This happening likely means a corrupt response proto has been received.");
          goto _L14
        if (((Cursor) (obj1)).moveToNext()) goto _L7; else goto _L8
_L8:
        ((Cursor) (obj1)).close();
_L6:
        dfb = ((cut) (obj)).a;
        if (!TextUtils.isEmpty(dfb))
        {
            ((bzu)hgx.a(g.nS, bzu)).a(aoe1.f().h(), dfb);
        }
        cej.c(g.nS, aoe1.f().h());
        return;
        if (((Cursor) (obj)).moveToNext()) goto _L12; else goto _L13
_L13:
        ((Cursor) (obj)).close();
_L11:
        throw exception;
        if (true) goto _L1; else goto _L15
_L15:
    }

    public void a(dko dko)
    {
        super.a(dko);
        dko = (cut)dko;
        boolean flag;
        if (((cut) (dko)).o != null && g.b(((cut) (dko)).m) && !"image/gif".equals(((cut) (dko)).m))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
    }

    public String k()
    {
        return ((cut)b).c;
    }

    public String l()
    {
        return ((cut)b).j;
    }

    public String m()
    {
        return g;
    }

    public long n()
    {
        return h;
    }

    public String[] o()
    {
        return j;
    }

    public String[] p()
    {
        return k;
    }

    public String[] q()
    {
        return l;
    }

    public String[] r()
    {
        return i;
    }

    public boolean s()
    {
        return n;
    }
}
