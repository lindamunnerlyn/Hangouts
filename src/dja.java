// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.gms.maps.model.LatLng;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dja extends dgj
{

    private static final boolean a = false;
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private Long k;
    private final boolean l;
    private int m;
    private int n;
    private int o;
    private String p;
    private boolean q;
    private fik r;
    private String s;
    private String t;
    private int u;
    private long v;
    private final long w;
    private final Context x;

    public dja(Context context, aoa aoa1, String s1, long l1, long l2)
    {
        super(aoa1);
        w = SystemClock.elapsedRealtime() * 1000L;
        x = context;
        if (l1 != -1L)
        {
            k = Long.valueOf(l1);
        }
        e = s1;
        l = true;
        v = l2;
    }

    public dja(Context context, aoa aoa1, String s1, String s2, String s3, int i1)
    {
        super(aoa1);
        w = SystemClock.elapsedRealtime() * 1000L;
        x = context;
        e = s1;
        t = s2;
        l = false;
        q = true;
        u = i1;
        p = s3;
    }

    public dja(Context context, aoa aoa1, String s1, String s2, String s3, String s4, int i1, 
            String s5, int j1, int k1, String s6, String s7, boolean flag, fik fik1, 
            long l1, int i2)
    {
        super(aoa1);
        w = SystemClock.elapsedRealtime() * 1000L;
        x = context;
        e = s1;
        f = s2;
        g = s3;
        h = s4;
        i = i1;
        j = s5;
        n = j1;
        o = k1;
        s = s6;
        p = s7;
        l = false;
        q = flag;
        v = l1;
        m = i2;
        r = fik1;
    }

    private long a(aow aow1, int i1)
    {
        aow1.a();
        long l1 = aow1.b(e, 1000);
        if (t == null) goto _L2; else goto _L1
_L1:
        if (u <= 0) goto _L4; else goto _L3
_L3:
        int j1 = u;
_L7:
        g = x.getResources().getQuantityString(g.hE, j1, new Object[] {
            Integer.valueOf(j1)
        });
_L2:
        Object obj;
        String s1;
        Object obj1;
        String s3;
        String s5;
        dsu dsu1;
        a(i1);
        obj = d();
        s1 = e;
        obj1 = super.b.b.b();
        s3 = f;
        s5 = g;
        dsu1 = dsu.b;
        if (q)
        {
            i1 = 129;
        } else
        {
            i1 = 0;
        }
        obj = new dkp(s1, ((cgd) (obj1)), l1, s3, null, s5, ((List) (obj)), false, dsu1, 0, 3, null, null, 0L, i1, 0L, p, 6, t, u, 0L);
        obj1 = aoq.f(aow1, e);
        if (q)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ((dkp) (obj)).a(i1);
        ((dkp) (obj)).a(dsu.c);
        ((dkp) (obj)).b(TextUtils.join(",", ((Iterable) (obj1))));
        ((dkp) (obj)).a(aow1, super.c);
        if (!q) goto _L6; else goto _L5
_L5:
        a(((dmf) ((new djf(e, f, l1)).a((String[])((List) (obj1)).toArray(new String[0])).a(p).b(g).c(h).d(s).a(n).b(o).c(i).e(t).d(u).a(((dkp) (obj)).a()).a())));
_L8:
        obj = Long.valueOf(((dkp) (obj)).a());
        aow1.b();
        aow1.c();
        aoq.d(aow1, e);
        String s2;
        String s4;
        long l2;
        if (obj == null)
        {
            return -1L;
        } else
        {
            return g.a(((Long) (obj)), 0L);
        }
_L4:
        j1 = 1;
          goto _L7
_L6:
        l2 = due.a(x, ((List) (obj1)));
        s2 = aow1.Y(e);
        obj1 = ((List) (obj1)).iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            s4 = (String)((Iterator) (obj1)).next();
            a(((dmf) ((new djn(e, f, l1)).a(s4).b(g).a(l2).c(s2).b(((dkp) (obj)).a()).a())));
        }
          goto _L8
        obj;
        aow1.c();
        throw obj;
          goto _L7
    }

    private long a(aow aow1, int i1, String s1)
    {
        long l1;
        aow1.a();
        l1 = SystemClock.elapsedRealtime();
        aoz aoz1;
        a(i1);
        aoz1 = aow1.f(e);
        Object obj1 = aoz1;
        if (aoz1 != null) goto _L2; else goto _L1
_L1:
        Object obj = aoz1;
        if (!aow.a(e)) goto _L4; else goto _L3
_L3:
        obj1 = RealTimeChatService.a(e);
        obj = aoz1;
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        e = ((String) (obj1));
        if (!a) goto _L7; else goto _L6
_L6:
        obj = String.valueOf(e);
        if (((String) (obj)).length() == 0) goto _L9; else goto _L8
_L8:
        obj = "sendMessageLocally conversationId changed: ".concat(((String) (obj)));
_L19:
        eev.b("Babel", ((String) (obj)));
_L7:
        obj = aow1.f(e);
_L4:
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L10
_L10:
        s1 = String.valueOf(e);
        if (s1.length() == 0) goto _L12; else goto _L11
_L11:
        s1 = "Failed to find conversation: ".concat(s1);
_L13:
        eev.f("Babel", s1);
        aow1.b();
        aow1.c();
        return -1L;
_L9:
        obj = new String("sendMessageLocally conversationId changed: ");
        continue; /* Loop/switch isn't completed */
        s1;
        aow1.c();
        throw s1;
_L12:
        s1 = new String("Failed to find conversation: ");
          goto _L13
_L2:
        long l2 = aow.a(((aoz) (obj1)).q, 1);
        if (m != 1) goto _L15; else goto _L14
_L14:
        boolean flag = true;
_L17:
        s1 = b(aow1, l2, f, flag, i1, s1, ((aoz) (obj1)));
        aow1.b();
        aow1.c();
        long l3 = SystemClock.elapsedRealtime();
        i1 = super.b.a;
        cab cab1 = (new cab()).b(f).a(e);
        h.a(i1, v / 1000L, 11, cab1.a(0));
        h.a(i1, w / 1000L, 10, cab1.a(201));
        h.a(i1, l1, 10, cab1.a(101));
        h.a(i1, l3, 10, cab1.a(102));
        aoq.d(aow1, e);
        if (s1 == null)
        {
            return -1L;
        }
        break; /* Loop/switch isn't completed */
_L15:
        int j1;
        if (m == 2)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        j1 = ((aoz) (obj1)).l;
        if (j1 == 1)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        if (true) goto _L17; else goto _L16
_L16:
        return g.a(s1, 0L);
        if (true) goto _L19; else goto _L18
_L18:
    }

    private void a(int i1)
    {
        if (r != null && g.e(i1))
        {
            StringBuilder stringbuilder = new StringBuilder(g);
            Object obj = ((bzi)hlp.a(x, bzi)).b(r);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(((String) (obj)));
            boolean flag;
            if (g.length() <= 160)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gdv.a("Expected condition to be true", flag);
            stringbuilder.append("\n");
            stringbuilder.append(r.c());
            obj = r.b();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append("\n");
                stringbuilder.append(((CharSequence) (obj)));
            }
            g = stringbuilder.toString();
        }
    }

    public static void a(aow aow1, dgk dgk1, apk apk1, aoz aoz1)
    {
        String s5;
        String s6;
        s5 = apk1.b;
        s6 = apk1.a;
        if (aow.a(s5) || aoz1.i != 0) goto _L2; else goto _L1
_L1:
        if (!aow1.aa(s5)) goto _L4; else goto _L3
_L3:
        aoq.a(aow1.f(), s5, 5);
        if (a)
        {
            apk1 = String.valueOf("Messaging: delay sending message pending converting conversation to be permanent. ConversationId:");
            eev.b("Babel", (new StringBuilder(String.valueOf(apk1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(apk1).append(s5).append(" messageId: ").append(s6).toString());
        }
        dgk1.a(new cwg(new cvz(aow.g(), 1, null, aoq.a(aow1.f(), s5)), s5));
        eev.a("Babel", "Checking the server to see if we can move this conversation fromthe contingency state");
_L6:
        return;
_L4:
label0:
        {
label1:
            {
                boolean flag;
                {
                    if (a)
                    {
                        String s1 = String.valueOf("Messaging: creating SendChatMessageRequest for message. ConversationId:");
                        eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(s1).append(s5).append(" messageId: ").append(s6).toString());
                    }
                    String s2;
                    int i1;
                    if (a && g.w(apk1.e))
                    {
                        s2 = String.valueOf("Sending stress message from SendMessageGeneralOperation:");
                        String s3 = String.valueOf(apk1.e);
                        double d1;
                        double d2;
                        String s4;
                        List list;
                        String s7;
                        String s8;
                        String s9;
                        String s10;
                        String s11;
                        String s12;
                        String s13;
                        int j1;
                        int k1;
                        int l1;
                        long l2;
                        if (s3.length() != 0)
                        {
                            s2 = s2.concat(s3);
                        } else
                        {
                            s2 = new String(s2);
                        }
                        eev.b("Babel_Stress", s2);
                    }
                    l2 = aow1.k(s5);
                    list = g.i(apk1.a());
                    if ("hangouts/location".equals(apk1.o))
                    {
                        s2 = apk1.k;
                    } else
                    {
                        s2 = apk1.j;
                    }
                    switch (apk1.z)
                    {
                    default:
                        if (apk1.x == 1)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                    case 2: // '\002'
                        break label1;
                    }
                }
                s4 = null;
                s3 = s4;
                if (apk1.l != null)
                {
                    s3 = s4;
                    if (aow1.ai(apk1.l) != null)
                    {
                        s3 = g.a(g.nU, "babel_stickers_account_id", "108618507921641169817");
                    }
                }
                s4 = aow1.V(s5);
                s7 = apk1.l;
                s8 = apk1.o;
                j1 = apk1.D;
                k1 = apk1.A;
                l1 = apk1.B;
                s9 = apk1.p;
                s10 = apk1.q;
                d1 = apk1.r;
                d2 = apk1.s;
                s11 = apk1.t;
                s12 = apk1.u;
                s13 = apk1.v;
                if (aoz1.m == 2)
                {
                    if (aoz1.l == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (apk1.i > 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                dgk1.a(new cwx(s6, s5, s4, l2, list, s7, s3, s8, j1, s2, k1, l1, s9, s10, d1, d2, s11, s12, s13, flag, apk1.x, apk1.y, i1));
                aow1.a(s5, s6, dsu.c, 0);
                aow1.b(s5, l2 + 1L);
                return;
            }
            i1 = 11;
            break MISSING_BLOCK_LABEL_383;
        }
        i1 = 2;
        break MISSING_BLOCK_LABEL_383;
_L2:
        if (aoz1.i == 2 || aoz1.k == 1)
        {
            if (a)
            {
                aow1 = String.valueOf("Messaging: delay sending message pending re-accept an invite. ConversationId:");
                eev.b("Babel", (new StringBuilder(String.valueOf(aow1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aow1).append(s5).append(" messageId: ").append(s6).toString());
            }
            if (aoz1.i == 2)
            {
                eev.b("Babel", "Retry invitation accept reply since it permenantly failed");
            } else
            {
                eev.b("Babel", "Send invitation accept reply since it is invited");
            }
            dgk1.a(new cwu(s5));
            return;
        }
        if (aoz1.i == 4)
        {
            if (a)
            {
                dgk1 = String.valueOf("Messaging: delay sending message pending re-creation of conversation on server. ConversationId:");
                eev.b("Babel", (new StringBuilder(String.valueOf(dgk1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(dgk1).append(s5).append(" messageId: ").append(s6).toString());
            }
            RealTimeChatService.i(aow1.f(), s5);
            return;
        }
        if (a)
        {
            if (aoz1.i == 1)
            {
                aow1 = String.valueOf("Messaging: delay sending message pending an in-flight accept invite request. ConversationId:");
                eev.b("Babel", (new StringBuilder(String.valueOf(aow1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aow1).append(s5).append(" messageId: ").append(s6).toString());
                return;
            }
            if (aoz1.i == 3)
            {
                aow1 = String.valueOf("Messaging: delay sending message pending an in-flight conversation creation request. ConversationId:");
                eev.b("Babel", (new StringBuilder(String.valueOf(aow1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aow1).append(s5).append(" messageId: ").append(s6).toString());
                return;
            }
            if (aoz1.i == 5)
            {
                aow1 = String.valueOf("Messaging: delay sending message pending an in-flight persist conversation request. ConversationId:");
                eev.b("Babel", (new StringBuilder(String.valueOf(aow1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aow1).append(s5).append(" messageId: ").append(s6).toString());
                return;
            } else
            {
                eev.g("Babel", "Invalid state for conversation disposition");
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(String s1)
    {
        int i1;
        if (eev.a("Babel", 3))
        {
            Object obj = String.valueOf(s1);
            long l1;
            if (((String) (obj)).length() != 0)
            {
                obj = "Check readiness for location image: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Check readiness for location image: ");
            }
            eev.d("Babel", ((String) (obj)));
        }
        i1 = 0;
_L2:
        if (i1 >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = x.getContentResolver().openFileDescriptor(Uri.parse(s1), "r");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        l1 = ((ParcelFileDescriptor) (obj)).getStatSize();
        if (l1 > 0L)
        {
            return true;
        }
        Thread.sleep(1000L);
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
        Object obj1;
        obj1;
        String s2 = String.valueOf(s1);
        if (s2.length() != 0)
        {
            s2 = "Location image not ready, will retry after 1 second: ".concat(s2);
        } else
        {
            s2 = new String("Location image not ready, will retry after 1 second: ");
        }
        eev.f("Babel", s2);
          goto _L3
        s2;
        String s3 = String.valueOf(s1);
        if (s3.length() != 0)
        {
            s3 = "Location image check interrupted.".concat(s3);
        } else
        {
            s3 = new String("Location image check interrupted.");
        }
        eev.f("Babel", s3);
_L1:
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "Failed to get location image. Skipping it: ".concat(s1);
        } else
        {
            s1 = new String("Failed to get location image. Skipping it: ");
        }
        eev.g("Babel", s1);
        return false;
    }

    private List d()
    {
        ArrayList arraylist = new ArrayList();
        if (!"hangouts/location".equals(s)) goto _L2; else goto _L1
_L1:
        if (r == null)
        {
            eev.g("Babel", "mPlace should not be null");
            return arraylist;
        }
        String s1 = r.c().toString();
        double d1 = r.d().a;
        double d2 = r.d().b;
        String s3 = r.b().toString();
        Object obj = (bzi)hlp.a(x, bzi);
        String s5 = ((bzi) (obj)).a(r);
        obj = ((bzi) (obj)).b(r);
        arraylist.add(new dmr(new int[] {
            0
        }, s1, d1, d2, s3, s5, ((String) (obj))));
_L4:
        return arraylist;
_L2:
        if (j != null || h != null)
        {
            String s2;
            String s4;
            String s6;
            int i1;
            int j1;
            int k1;
            if (j != null)
            {
                eev.e("Babel", "[SendMessageOp] photo: sending photo with photo id");
            } else
            {
                eev.e("Babel", "[SendMessageOp] photo: sending photo with url");
            }
            if (s == null)
            {
                s = x.getContentResolver().getType(Uri.parse(h));
                if (s == null)
                {
                    s = "image/jpg";
                }
            }
            s2 = j;
            s4 = h;
            i1 = n;
            j1 = o;
            s6 = s;
            k1 = i;
            arraylist.add(new dms(new int[] {
                0
            }, s2, s4, i1, j1, s6, k1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected long a(aow aow1, long l1, String s1, boolean flag, int i1, String s2)
    {
        List list = g.a(g, 0);
        List list1 = d();
        s1 = new dkp(e, super.b.b.b(), l1, s1, list, null, list1, flag, dsu.b, 0, i1, s2, null, 0L, 0, 0L, p, 6, null, 0, v);
        s1.a(aow1, super.c);
        return s1.a();
    }

    public void a()
    {
        aoz aoz1;
        Object obj1;
        int i1;
        long l1;
        aoz1 = null;
        if (l)
        {
            if (eev.a("Babel", 3))
            {
                eev.c("Babel", "retrySendMessage");
            }
            aow aow1 = new aow(x, super.b.a);
            aoz1 = aow1.e(e);
            aoq.a(aow1, e, aoz1, g.a(k, 0L), super.c, v, w);
            return;
        }
        String s1;
        boolean flag;
        if (eev.a("Babel", 3))
        {
            if (g != null)
            {
                s1 = "...";
            } else
            {
                s1 = null;
            }
            obj1 = h;
            i1 = i;
            eev.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 65 + String.valueOf(obj1).length())).append("sendOriginalMessage: text=").append(s1).append(", mAttachmentUri=").append(((String) (obj1))).append(", rotation=").append(i1).toString());
        }
        obj1 = new aow(x, super.b.a);
        if (eev.a("Babel", 3))
        {
            s1 = String.valueOf(e);
            if (s1.length() != 0)
            {
                s1 = "sendMessageLocally conversationId: ".concat(s1);
            } else
            {
                s1 = new String("sendMessageLocally conversationId: ");
            }
            eev.c("Babel", s1);
        }
        flag = g.e(s);
        if (j != null)
        {
            if (eev.a("Babel", 3))
            {
                s1 = String.valueOf(j);
                if (s1.length() != 0)
                {
                    s1 = "sending image picasaPhotoId ".concat(s1);
                } else
                {
                    s1 = new String("sending image picasaPhotoId ");
                }
                eev.c("Babel", s1);
            }
        } else
        if (!flag && h != null)
        {
            if (eev.a("Babel", 3))
            {
                String s2 = String.valueOf(h);
                if (s2.length() != 0)
                {
                    s2 = "sending image ".concat(s2);
                } else
                {
                    s2 = new String("sending image ");
                }
                eev.c("Babel", s2);
            }
            if (h.startsWith(EsProvider.c(x)))
            {
                eev.c("Babel", "Sticker cache file found.");
            } else
            if (TextUtils.equals(Uri.parse(h).getAuthority(), EsProvider.a))
            {
                if (eev.a("Babel", 3))
                {
                    String s3 = String.valueOf(h);
                    if (s3.length() != 0)
                    {
                        s3 = "sending attachment ".concat(s3);
                    } else
                    {
                        s3 = new String("sending attachment ");
                    }
                    eev.c("Babel", s3);
                }
                if ("hangouts/location".equals(s))
                {
                    if (a(h))
                    {
                        s = "image/jpeg";
                    } else
                    {
                        String s4 = String.valueOf(h);
                        if (s4.length() != 0)
                        {
                            s4 = "sending location failed because image not ready ".concat(s4);
                        } else
                        {
                            s4 = new String("sending location failed because image not ready ");
                        }
                        eev.f("Babel", s4);
                        h = null;
                    }
                }
            } else
            {
                eev.f("Babel", "trying to send an attachment that doesn't exist");
                h = null;
            }
        }
        i1 = ((aow) (obj1)).g(e);
        if (!g.d(i1)) goto _L2; else goto _L1
_L1:
        if (!eey.c())
        {
            RealTimeChatService.g(super.b.b);
        }
        l1 = a(((aow) (obj1)), i1);
_L4:
        k = Long.valueOf(l1);
        return;
_L2:
        Object obj;
        switch (i1)
        {
        default:
            obj = aoz1;
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_709;
        }
_L5:
        l1 = a(((aow) (obj1)), i1, ((String) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        obj = super.b.b.A();
          goto _L5
        obj = eey.g();
          goto _L5
    }

    protected void a(aow aow1, long l1, String s1, boolean flag, int i1, String s2, 
            aoz aoz1)
    {
        String s4 = null;
        double d1 = 0.0D;
        double d2 = 0.0D;
        String s5 = null;
        String s3 = null;
        Object obj = null;
        if (r != null)
        {
            g.a(aow1.f(), 1941);
            s4 = r.c().toString();
            d1 = r.d().a;
            d2 = r.d().b;
            s5 = r.b().toString();
            obj = (bzi)hlp.a(x, bzi);
            s3 = ((bzi) (obj)).a(r);
            obj = ((bzi) (obj)).b(r);
        }
        byte byte0 = -1;
        String s6;
        String s7;
        String s8;
        String s9;
        dsu dsu1;
        dsv dsv1;
        long l2;
        if (g.e(i1))
        {
            if (q)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
        }
        s6 = g.a(g.a(g, 0), null);
        s7 = e;
        s8 = super.b.b.b().b;
        s9 = g;
        dsu1 = dsu.b;
        dsv1 = dsv.b;
        if (flag)
        {
            l2 = 0x7fffffffffffffffL;
        } else
        {
            l2 = 0L;
        }
        s1 = new apk(s1, s7, s8, s9, s6, dsu1, dsv1, l1, l2, h, s3, j, null, null, s, s4, d1, d2, s5, ((String) (obj)), i1, s2, byte0, n, o, null, i, null, null, null, 0, null, null, null, 0L, 2);
        a(aow1, super.c, ((apk) (s1)), aoz1);
    }

    protected Long b(aow aow1, long l1, String s1, boolean flag, int i1, String s2, 
            aoz aoz1)
    {
        long l2 = a(aow1, l1, s1, flag, i1, s2);
        a(aow1, l1, s1, flag, i1, s2, aoz1);
        return Long.valueOf(l2);
    }

    public Object c()
    {
        return k;
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
