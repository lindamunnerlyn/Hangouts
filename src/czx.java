// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.List;

public class czx extends cxr
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

    private czx(jdt jdt1)
    {
        super(jdt1.responseHeader, g.a(jdt1.c.c, 0L));
        g = jdt1.c.d;
        h = g.a(jdt1.c.n, 0L);
        int k1 = jdt1.b.length;
        j = new String[k1];
        k = new String[k1];
        l = new String[k1];
        i = new String[k1];
        o = g.a(jdt1.responseHeader.d, 0L);
        int i1;
        if (jdt1.c.e != null && jdt1.c.e.d != null)
        {
            m = kws.toByteArray(jdt1.c.e.d);
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
                kys kys1 = (kys)jdt1.b[i1].a.a.getExtension(kys.a);
                j[i1] = kys1.e;
                k[i1] = kys1.d;
                l[i1] = kys1.h;
                int l1 = kys1.f.length;
                int j1 = 0;
                do
                {
label1:
                    {
                        if (j1 < l1)
                        {
                            String s1 = kys1.f[j1];
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
            if (cxr.a)
            {
                jdt1 = String.valueOf(jdt1);
                eev.b("Babel_protos", (new StringBuilder(String.valueOf(jdt1).length() + 29)).append("SendChatMessageResponse from:").append(jdt1).toString());
            }
            return;
        } while (true);
    }

    public static cxr parseFrom(jdt jdt1)
    {
        if (a(jdt1.responseHeader))
        {
            return new cyd(jdt1.responseHeader);
        } else
        {
            return new czx(jdt1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jdt)kws.mergeFrom(new jdt(), abyte0));
    }

    public void a(aow aow1, dgk dgk)
    {
        String s1;
        Object obj;
        long l2 = SystemClock.elapsedRealtime();
        super.a(aow1, dgk);
        s1 = k();
        obj = l();
        if (cxr.a)
        {
            dgk = g;
            long l3 = d;
            int i1 = j.length;
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 157 + String.valueOf(dgk).length() + String.valueOf(obj).length())).append("processSendChatMessageResponse Conversation id: ").append(s1).append(", messageId: ").append(dgk).append(", messageTimestamp: ").append(l3).append(", messageClientGeneratedId: ").append(((String) (obj))).append(", mediaId count: ").append(i1).toString());
            String as[] = j;
            int i2 = as.length;
            i1 = 0;
            while (i1 < i2) 
            {
                dgk = String.valueOf(as[i1]);
                if (dgk.length() != 0)
                {
                    dgk = "  photoId ".concat(dgk);
                } else
                {
                    dgk = new String("  photoId ");
                }
                eev.b("Babel", dgk);
                i1++;
            }
            as = k;
            i2 = as.length;
            i1 = 0;
            while (i1 < i2) 
            {
                dgk = String.valueOf(as[i1]);
                if (dgk.length() != 0)
                {
                    dgk = "  albumId ".concat(dgk);
                } else
                {
                    dgk = new String("  albumId ");
                }
                eev.b("Babel", dgk);
                i1++;
            }
        }
        if (cxr.a)
        {
            String s2 = m();
            if (s2 != null)
            {
                dgk = String.valueOf("Stress message sent successful update message state:");
                s2 = String.valueOf(s2);
                String as1[];
                String s3;
                int j1;
                int j2;
                long l4;
                long l5;
                if (s2.length() != 0)
                {
                    dgk = dgk.concat(s2);
                } else
                {
                    dgk = new String(dgk);
                }
                eev.b("Babel_Stress", dgk);
            }
        }
        aow1.a();
        l4 = SystemClock.elapsedRealtime();
        if (cxr.a)
        {
            eev.b("Babel", "modifying database");
        }
        dgk = aow1.f(s1, ((String) (obj)));
        if (dgk == null) goto _L2; else goto _L1
_L1:
        if (dgk != null) goto _L4; else goto _L3
_L3:
        dgk = String.valueOf("Received SendChatMessageResponse for nonexistant  clientGeneratedId  = ");
        s2 = String.valueOf(o());
        eev.g("Babel", (new StringBuilder(String.valueOf(dgk).length() + 14 + String.valueOf(obj).length() + String.valueOf(s2).length())).append(dgk).append(((String) (obj))).append(" /  eventId = ").append(s2).toString());
_L9:
        dgk = m;
        if (dgk == null)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        dkp.a(((jfg)kws.mergeFrom(new jfg(), m)).a, s1, g, d, aow1);
_L14:
        l5 = SystemClock.elapsedRealtime();
        j1 = aow1.f().h();
        dgk = (new cab()).b(((String) (obj))).a(s1);
        h.a(j1, l2, 10, dgk.a(204));
        h.a(j1, l4, 10, dgk.a(103));
        h.a(j1, l5, 13, dgk.a(0));
        aow1.b();
        aow1.c();
        if (!cxr.a) goto _L6; else goto _L5
_L5:
        obj = aow1.e().a("messages", null, "message_id=? OR message_id=?", new String[] {
            l(), o()
        }, null);
        dgk = String.valueOf("SendChatMessage.processResponse after endTransaction  cursor count is ");
        j1 = ((Cursor) (obj)).getCount();
        eev.b("Babel", (new StringBuilder(String.valueOf(dgk).length() + 11)).append(dgk).append(j1).toString());
        if (!((Cursor) (obj)).moveToFirst()) goto _L8; else goto _L7
_L7:
        as1 = ((Cursor) (obj)).getColumnNames();
        j2 = as1.length;
        for (j1 = 0; j1 < j2; j1++)
        {
            s3 = as1[j1];
            s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(s3));
            dgk = s1;
            if (s3.equals("text"))
            {
                dgk = eev.b(s1);
            }
            eev.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 5 + String.valueOf(dgk).length())).append(s3).append(" ==> ").append(dgk).toString());
        }

        continue; /* Loop/switch isn't completed */
_L2:
        dgk = aow1.f(s1, o());
        continue; /* Loop/switch isn't completed */
_L4:
        aow1.a(s1, g.a(dgk, 0L), g.a(Long.valueOf(d), 0L), g.a(Long.valueOf(h), 0L));
        aow1.a(s1, g.a(Long.valueOf(d), 0L), g.a(dgk, 0L));
        aow1.a(this);
        aow1.g(s1, g.a(Long.valueOf(d), 0L));
        aoq.d(aow1, s1);
          goto _L9
        Exception exception;
        exception;
        aow1.c();
        if (!cxr.a) goto _L11; else goto _L10
_L10:
        obj = aow1.e().a("messages", null, "message_id=? OR message_id=?", new String[] {
            l(), o()
        }, null);
        aow1 = String.valueOf("SendChatMessage.processResponse after endTransaction  cursor count is ");
        int k1 = ((Cursor) (obj)).getCount();
        eev.b("Babel", (new StringBuilder(String.valueOf(aow1).length() + 11)).append(aow1).append(k1).toString());
        if (!((Cursor) (obj)).moveToFirst()) goto _L13; else goto _L12
_L12:
        String as2[] = ((Cursor) (obj)).getColumnNames();
        int k2 = as2.length;
        for (int l1 = 0; l1 < k2; l1++)
        {
            String s4 = as2[l1];
            dgk = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(s4));
            aow1 = dgk;
            if (s4.equals("text"))
            {
                aow1 = eev.b(dgk);
            }
            eev.b("Babel", (new StringBuilder(String.valueOf(s4).length() + 5 + String.valueOf(aow1).length())).append(s4).append(" ==> ").append(aow1).toString());
        }

        continue; /* Loop/switch isn't completed */
        dgk;
        eev.g("Babel", "Invalid ClientSuggestions protobuf parsed from ClientSendChatMessageResponse. This happening likely means a corrupt response proto has been received.");
          goto _L14
        if (((Cursor) (obj)).moveToNext()) goto _L7; else goto _L8
_L8:
        ((Cursor) (obj)).close();
_L6:
        dgk = n();
        if (!TextUtils.isEmpty(dgk))
        {
            ((cax)hlp.a(g.nU, cax)).a(aow1.f().h(), dgk);
        }
        cfo.c(g.nU, aow1.f().h());
        return;
        if (((Cursor) (obj)).moveToNext()) goto _L12; else goto _L13
_L13:
        ((Cursor) (obj)).close();
_L11:
        throw exception;
        if (true) goto _L1; else goto _L15
_L15:
    }

    public void a(dmf dmf)
    {
        boolean flag = true;
        super.a(dmf);
        if (dmf instanceof cwx)
        {
            dmf = (cwx)dmf;
            if (((cwx) (dmf)).o != null && g.b(((cwx) (dmf)).m) && !"image/gif".equals(((cwx) (dmf)).m))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n = flag;
        } else
        if (dmf instanceof djh)
        {
            dmf = ((djh)dmf).e();
            if (dmf != null && dmf.size() != 0)
            {
                if (((ato)dmf.get(0)).c != atp.b || !g.b(((ato)dmf.get(0)).d) || "image/gif".equals(((ato)dmf.get(0)).d))
                {
                    flag = false;
                }
                n = flag;
                return;
            }
        }
    }

    public String k()
    {
        if (b instanceof cwx)
        {
            return ((cwx)b).c;
        }
        if (b instanceof djh)
        {
            return ((djh)b).b();
        } else
        {
            return null;
        }
    }

    public String l()
    {
        if (b instanceof cwx)
        {
            return ((cwx)b).j;
        }
        if (b instanceof djh)
        {
            return ((djh)b).a();
        } else
        {
            return null;
        }
    }

    public String m()
    {
        if (b instanceof cwx)
        {
            return ((cwx)b).e();
        }
        if (b instanceof djh)
        {
            return ((djh)b).o();
        } else
        {
            return null;
        }
    }

    public String n()
    {
        if (b instanceof cwx)
        {
            return ((cwx)b).a;
        }
        if (b instanceof djh)
        {
            return ((djh)b).c();
        } else
        {
            return null;
        }
    }

    public String o()
    {
        return g;
    }

    public long p()
    {
        return h;
    }

    public String[] q()
    {
        return j;
    }

    public String[] r()
    {
        return k;
    }

    public String[] s()
    {
        return l;
    }

    public String[] t()
    {
        return i;
    }

    public boolean u()
    {
        return n;
    }
}
