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

public class dhr extends dfa
{

    private static final boolean a = false;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private Long i;
    private final boolean j;
    private int k;
    private int l;
    private int m;
    private String n;
    private boolean o;
    private ffo p;
    private String q;
    private String r;
    private int s;
    private long t;
    private final long u;
    private final Context v;

    public dhr(Context context, ani ani1, String s1, long l1, long l2)
    {
        super(ani1);
        u = SystemClock.elapsedRealtime() * 1000L;
        v = context;
        if (l1 != -1L)
        {
            i = Long.valueOf(l1);
        }
        d = s1;
        j = true;
        t = l2;
    }

    public dhr(Context context, ani ani1, String s1, String s2, String s3, int i1)
    {
        super(ani1);
        u = SystemClock.elapsedRealtime() * 1000L;
        v = context;
        d = s1;
        r = s2;
        j = false;
        o = true;
        s = i1;
        n = s3;
    }

    public dhr(Context context, ani ani1, String s1, String s2, String s3, int i1, String s4, 
            int j1, int k1, String s5, String s6, boolean flag, ffo ffo1, long l1, int i2)
    {
        super(ani1);
        u = SystemClock.elapsedRealtime() * 1000L;
        v = context;
        d = s1;
        e = s2;
        f = s3;
        g = i1;
        h = s4;
        l = j1;
        m = k1;
        q = s5;
        n = s6;
        j = false;
        o = flag;
        t = l1;
        k = i2;
        p = ffo1;
    }

    private long a(aoe aoe1, int i1)
    {
        aoe1.a();
        Object obj;
        long l1;
        obj = aoe.g();
        l1 = aoe1.b(d, 1000);
        if (r == null) goto _L2; else goto _L1
_L1:
        if (s <= 0) goto _L4; else goto _L3
_L3:
        int j1 = s;
_L7:
        e = v.getResources().getQuantityString(g.hM, j1, new Object[] {
            Integer.valueOf(j1)
        });
_L2:
        Object obj1;
        String s1;
        Object obj2;
        String s3;
        dqb dqb1;
        a(i1);
        obj1 = d();
        s1 = d;
        obj2 = b.b();
        s3 = e;
        dqb1 = dqb.b;
        if (o)
        {
            i1 = 129;
        } else
        {
            i1 = 0;
        }
        obj1 = new djc(s1, ((cey) (obj2)), l1, ((String) (obj)), null, s3, ((List) (obj1)), false, dqb1, 0, 3, null, null, 0L, i1, 0L, n, 6, r, s, 0L);
        obj2 = any.f(aoe1, d);
        if (o)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ((djc) (obj1)).a(i1);
        ((djc) (obj1)).a(dqb.c);
        ((djc) (obj1)).b(TextUtils.join(",", ((Iterable) (obj2))));
        ((djc) (obj1)).a(aoe1, c);
        if (!o) goto _L6; else goto _L5
_L5:
        obj = (new dhw(d, ((String) (obj)), l1)).a((String[])((List) (obj2)).toArray(new String[0])).a(n).b(e).c(f).d(q).a(l).b(m).c(g).e(r).d(s).a(((djc) (obj1)).a()).a();
        c.a(((dko) (obj)));
_L8:
        obj = Long.valueOf(((djc) (obj1)).a());
        aoe1.b();
        aoe1.c();
        any.d(aoe1, d);
        String s2;
        Object obj3;
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
        l2 = drk.a(v, ((List) (obj2)));
        s2 = aoe1.Z(d);
        obj2 = ((List) (obj2)).iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            obj3 = (String)((Iterator) (obj2)).next();
            obj3 = (new dib(d, ((String) (obj)), l1)).a(((String) (obj3))).b(e).a(l2).c(s2).b(((djc) (obj1)).a()).a();
            c.a(((dko) (obj3)));
        }
          goto _L8
        obj;
        aoe1.c();
        throw obj;
          goto _L7
    }

    private long a(aoe aoe1, int i1, String s1)
    {
        String s2;
        long l1;
        aoe1.a();
        l1 = SystemClock.elapsedRealtime();
        s2 = aoe.g();
        aoh aoh1;
        a(i1);
        aoh1 = aoe1.f(d);
        Object obj1 = aoh1;
        if (aoh1 != null) goto _L2; else goto _L1
_L1:
        Object obj = aoh1;
        if (!aoe.a(d)) goto _L4; else goto _L3
_L3:
        obj1 = RealTimeChatService.a(d);
        obj = aoh1;
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        d = ((String) (obj1));
        if (!a) goto _L7; else goto _L6
_L6:
        obj = String.valueOf(d);
        if (((String) (obj)).length() == 0) goto _L9; else goto _L8
_L8:
        obj = "sendMessageLocally conversationId changed: ".concat(((String) (obj)));
_L19:
        ebw.b("Babel", ((String) (obj)));
_L7:
        obj = aoe1.f(d);
_L4:
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L10
_L10:
        s1 = String.valueOf(d);
        if (s1.length() == 0) goto _L12; else goto _L11
_L11:
        s1 = "Failed to find conversation: ".concat(s1);
_L13:
        ebw.f("Babel", s1);
        aoe1.b();
        aoe1.c();
        return -1L;
_L9:
        obj = new String("sendMessageLocally conversationId changed: ");
        continue; /* Loop/switch isn't completed */
        s1;
        aoe1.c();
        throw s1;
_L12:
        s1 = new String("Failed to find conversation: ");
          goto _L13
_L2:
        long l2 = aoe.a(((aoh) (obj1)).q, 1);
        if (k != 1) goto _L15; else goto _L14
_L14:
        boolean flag = true;
_L17:
        s1 = b(aoe1, l2, s2, flag, i1, s1, ((aoh) (obj1)));
        aoe1.b();
        aoe1.c();
        long l3 = SystemClock.elapsedRealtime();
        i1 = b.h();
        byy byy1 = (new byy()).b(s2).a(d);
        h.a(i1, t / 1000L, 11, byy1.a(0));
        h.a(i1, u / 1000L, 10, byy1.a(201));
        h.a(i1, l1, 10, byy1.a(101));
        h.a(i1, l3, 10, byy1.a(102));
        any.d(aoe1, d);
        if (s1 == null)
        {
            return -1L;
        }
        break; /* Loop/switch isn't completed */
_L15:
        int j1;
        if (k == 2)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        j1 = ((aoh) (obj1)).l;
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
        if (p != null && g.e(i1))
        {
            StringBuilder stringbuilder = new StringBuilder(e);
            Object obj = ((byf)hgx.a(v, byf)).b(p);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(((String) (obj)));
            boolean flag;
            if (e.length() <= 160)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            stringbuilder.append("\n");
            stringbuilder.append(p.c());
            obj = p.b();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append("\n");
                stringbuilder.append(((CharSequence) (obj)));
            }
            e = stringbuilder.toString();
        }
    }

    public static void a(aoe aoe1, dfb dfb1, aos aos1, aoh aoh1)
    {
        String s5;
        String s6;
        s5 = aos1.b;
        s6 = aos1.a;
        if (aoe.a(s5) || aoh1.i != 0) goto _L2; else goto _L1
_L1:
        if (!aoe1.ab(s5)) goto _L4; else goto _L3
_L3:
        any.a(aoe1.f(), s5, 5);
        if (a)
        {
            aos1 = String.valueOf("Messaging: delay sending message pending converting conversation to be permanent. ConversationId:");
            ebw.b("Babel", (new StringBuilder(String.valueOf(aos1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aos1).append(s5).append(" messageId: ").append(s6).toString());
        }
        dfb1.a(new cuc(new ctv(aoe.g(), 1, null, any.a(aoe1.f(), s5)), s5));
        ebw.a("Babel", "Checking the server to see if we can move this conversation fromthe contingency state");
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
                        ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(s1).append(s5).append(" messageId: ").append(s6).toString());
                    }
                    String s2;
                    int i1;
                    if (a && g.w(aos1.e))
                    {
                        s2 = String.valueOf("Sending stress message from SendMessageGeneralOperation:");
                        String s3 = String.valueOf(aos1.e);
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
                        ebw.b("Babel_Stress", s2);
                    }
                    l2 = aoe1.k(s5);
                    list = g.i(aos1.a());
                    if ("hangouts/location".equals(aos1.o))
                    {
                        s2 = aos1.k;
                    } else
                    {
                        s2 = aos1.j;
                    }
                    switch (aos1.z)
                    {
                    default:
                        if (aos1.x == 1)
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
                if (aos1.l != null)
                {
                    s3 = s4;
                    if (aoe1.aj(aos1.l) != null)
                    {
                        s3 = g.a(g.nS, "babel_stickers_account_id", "108618507921641169817");
                    }
                }
                s4 = aoe1.W(s5);
                s7 = aos1.l;
                s8 = aos1.o;
                j1 = aos1.D;
                k1 = aos1.A;
                l1 = aos1.B;
                s9 = aos1.p;
                s10 = aos1.q;
                d1 = aos1.r;
                d2 = aos1.s;
                s11 = aos1.t;
                s12 = aos1.u;
                s13 = aos1.v;
                if (aoh1.m == 2)
                {
                    if (aoh1.l == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (aos1.i > 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                dfb1.a(new cut(s6, s5, s4, l2, list, s7, s3, s8, j1, s2, k1, l1, s9, s10, d1, d2, s11, s12, s13, flag, aos1.x, aos1.y, i1));
                aoe1.a(s5, s6, dqb.c, 0);
                aoe1.b(s5, l2 + 1L);
                return;
            }
            i1 = 11;
            break MISSING_BLOCK_LABEL_383;
        }
        i1 = 2;
        break MISSING_BLOCK_LABEL_383;
_L2:
        if (aoh1.i == 2 || aoh1.k == 1)
        {
            if (a)
            {
                aoe1 = String.valueOf("Messaging: delay sending message pending re-accept an invite. ConversationId:");
                ebw.b("Babel", (new StringBuilder(String.valueOf(aoe1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aoe1).append(s5).append(" messageId: ").append(s6).toString());
            }
            if (aoh1.i == 2)
            {
                ebw.b("Babel", "Retry invitation accept reply since it permenantly failed");
            } else
            {
                ebw.b("Babel", "Send invitation accept reply since it is invited");
            }
            dfb1.a(new cuq(s5));
            return;
        }
        if (aoh1.i == 4)
        {
            if (a)
            {
                dfb1 = String.valueOf("Messaging: delay sending message pending re-creation of conversation on server. ConversationId:");
                ebw.b("Babel", (new StringBuilder(String.valueOf(dfb1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(dfb1).append(s5).append(" messageId: ").append(s6).toString());
            }
            RealTimeChatService.i(aoe1.f(), s5);
            return;
        }
        if (a)
        {
            if (aoh1.i == 1)
            {
                aoe1 = String.valueOf("Messaging: delay sending message pending an in-flight accept invite request. ConversationId:");
                ebw.b("Babel", (new StringBuilder(String.valueOf(aoe1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aoe1).append(s5).append(" messageId: ").append(s6).toString());
                return;
            }
            if (aoh1.i == 3)
            {
                aoe1 = String.valueOf("Messaging: delay sending message pending an in-flight conversation creation request. ConversationId:");
                ebw.b("Babel", (new StringBuilder(String.valueOf(aoe1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aoe1).append(s5).append(" messageId: ").append(s6).toString());
                return;
            }
            if (aoh1.i == 5)
            {
                aoe1 = String.valueOf("Messaging: delay sending message pending an in-flight persist conversation request. ConversationId:");
                ebw.b("Babel", (new StringBuilder(String.valueOf(aoe1).length() + 12 + String.valueOf(s5).length() + String.valueOf(s6).length())).append(aoe1).append(s5).append(" messageId: ").append(s6).toString());
                return;
            } else
            {
                ebw.g("Babel", "Invalid state for conversation disposition");
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean b(String s1)
    {
        int i1;
        if (ebw.a("Babel", 3))
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
            ebw.d("Babel", ((String) (obj)));
        }
        i1 = 0;
_L2:
        if (i1 >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = v.getContentResolver().openFileDescriptor(Uri.parse(s1), "r");
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
        ebw.f("Babel", s2);
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
        ebw.f("Babel", s3);
_L1:
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "Failed to get location image. Skipping it: ".concat(s1);
        } else
        {
            s1 = new String("Failed to get location image. Skipping it: ");
        }
        ebw.g("Babel", s1);
        return false;
    }

    private List d()
    {
        ArrayList arraylist = new ArrayList();
        if (!"hangouts/location".equals(q)) goto _L2; else goto _L1
_L1:
        if (p == null)
        {
            ebw.g("Babel", "mPlace should not be null");
            return arraylist;
        }
        String s1 = p.c().toString();
        double d1 = p.d().a;
        double d2 = p.d().b;
        String s3 = p.b().toString();
        Object obj = (byf)hgx.a(v, byf);
        String s5 = ((byf) (obj)).a(p);
        obj = ((byf) (obj)).b(p);
        arraylist.add(new crp(new int[] {
            0
        }, s1, d1, d2, s3, s5, ((String) (obj))));
_L4:
        return arraylist;
_L2:
        if (h != null || f != null)
        {
            String s2;
            String s4;
            String s6;
            int i1;
            int j1;
            int k1;
            if (h != null)
            {
                ebw.e("Babel", "[SendMessageOp] photo: sending photo with photo id");
            } else
            {
                ebw.e("Babel", "[SendMessageOp] photo: sending photo with url");
            }
            if (q == null)
            {
                q = v.getContentResolver().getType(Uri.parse(f));
                if (q == null)
                {
                    q = "image/jpg";
                }
            }
            s2 = h;
            s4 = f;
            i1 = l;
            j1 = m;
            s6 = q;
            k1 = g;
            arraylist.add(new crq(new int[] {
                0
            }, s2, s4, i1, j1, s6, k1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected long a(aoe aoe1, long l1, String s1, boolean flag, int i1, String s2)
    {
        List list = g.a(e, 0);
        List list1 = d();
        s1 = new djc(d, b.b(), l1, s1, list, null, list1, flag, dqb.b, 0, i1, s2, null, 0L, 0, 0L, n, 6, null, 0, t);
        s1.a(aoe1, c);
        return s1.a();
    }

    public void a()
    {
        aoh aoh1;
        Object obj1;
        int i1;
        long l1;
        aoh1 = null;
        if (j)
        {
            if (ebw.a("Babel", 3))
            {
                ebw.c("Babel", "retrySendMessage");
            }
            aoe aoe1 = new aoe(v, b.h());
            aoh1 = aoe1.e(d);
            any.a(aoe1, d, aoh1, g.a(i, 0L), c, t, u);
            return;
        }
        String s1;
        boolean flag;
        if (ebw.a("Babel", 3))
        {
            if (e != null)
            {
                s1 = "...";
            } else
            {
                s1 = null;
            }
            obj1 = f;
            i1 = g;
            ebw.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 65 + String.valueOf(obj1).length())).append("sendOriginalMessage: text=").append(s1).append(", mAttachmentUri=").append(((String) (obj1))).append(", rotation=").append(i1).toString());
        }
        obj1 = new aoe(v, b.h());
        if (ebw.a("Babel", 3))
        {
            s1 = String.valueOf(d);
            if (s1.length() != 0)
            {
                s1 = "sendMessageLocally conversationId: ".concat(s1);
            } else
            {
                s1 = new String("sendMessageLocally conversationId: ");
            }
            ebw.c("Babel", s1);
        }
        flag = g.e(q);
        if (h != null)
        {
            if (ebw.a("Babel", 3))
            {
                s1 = String.valueOf(h);
                if (s1.length() != 0)
                {
                    s1 = "sending image picasaPhotoId ".concat(s1);
                } else
                {
                    s1 = new String("sending image picasaPhotoId ");
                }
                ebw.c("Babel", s1);
            }
        } else
        if (!flag && f != null)
        {
            if (ebw.a("Babel", 3))
            {
                String s2 = String.valueOf(f);
                if (s2.length() != 0)
                {
                    s2 = "sending image ".concat(s2);
                } else
                {
                    s2 = new String("sending image ");
                }
                ebw.c("Babel", s2);
            }
            if (f.startsWith(EsProvider.c(v)))
            {
                ebw.c("Babel", "Sticker cache file found.");
            } else
            if (TextUtils.equals(Uri.parse(f).getAuthority(), EsProvider.a))
            {
                if (ebw.a("Babel", 3))
                {
                    String s3 = String.valueOf(f);
                    if (s3.length() != 0)
                    {
                        s3 = "sending attachment ".concat(s3);
                    } else
                    {
                        s3 = new String("sending attachment ");
                    }
                    ebw.c("Babel", s3);
                }
                if ("hangouts/location".equals(q))
                {
                    if (b(f))
                    {
                        q = "image/jpeg";
                    } else
                    {
                        String s4 = String.valueOf(f);
                        if (s4.length() != 0)
                        {
                            s4 = "sending location failed because image not ready ".concat(s4);
                        } else
                        {
                            s4 = new String("sending location failed because image not ready ");
                        }
                        ebw.f("Babel", s4);
                        f = null;
                    }
                }
            } else
            {
                ebw.f("Babel", "trying to send an attachment that doesn't exist");
                f = null;
            }
        }
        i1 = ((aoe) (obj1)).g(d);
        if (!g.d(i1)) goto _L2; else goto _L1
_L1:
        if (!ebz.c())
        {
            RealTimeChatService.g(b);
        }
        l1 = a(((aoe) (obj1)), i1);
_L4:
        i = Long.valueOf(l1);
        return;
_L2:
        Object obj;
        switch (i1)
        {
        default:
            obj = aoh1;
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_702;
        }
_L5:
        l1 = a(((aoe) (obj1)), i1, ((String) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        obj = b.C();
          goto _L5
        obj = ebz.g();
          goto _L5
    }

    protected void a(aoe aoe1, long l1, String s1, boolean flag, int i1, String s2, 
            aoh aoh1)
    {
        String s4 = null;
        double d1 = 0.0D;
        double d2 = 0.0D;
        String s5 = null;
        String s3 = null;
        Object obj = null;
        if (p != null)
        {
            g.a(aoe1.f(), 1941);
            s4 = p.c().toString();
            d1 = p.d().a;
            d2 = p.d().b;
            s5 = p.b().toString();
            obj = (byf)hgx.a(v, byf);
            s3 = ((byf) (obj)).a(p);
            obj = ((byf) (obj)).b(p);
        }
        byte byte0 = -1;
        String s6;
        String s7;
        String s8;
        String s9;
        dqb dqb1;
        dqc dqc1;
        long l2;
        if (g.e(i1))
        {
            if (o)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
        }
        s6 = g.a(g.a(e, 0), null);
        s7 = d;
        s8 = b.b().b;
        s9 = e;
        dqb1 = dqb.b;
        dqc1 = dqc.b;
        if (flag)
        {
            l2 = 0x7fffffffffffffffL;
        } else
        {
            l2 = 0L;
        }
        s1 = new aos(s1, s7, s8, s9, s6, dqb1, dqc1, l1, l2, f, s3, h, null, null, q, s4, d1, d2, s5, ((String) (obj)), i1, s2, byte0, l, m, null, g, null, null, null, 0, null, null, null, 0L);
        a(aoe1, c, ((aos) (s1)), aoh1);
    }

    protected Long b(aoe aoe1, long l1, String s1, boolean flag, int i1, String s2, 
            aoh aoh1)
    {
        long l2 = a(aoe1, l1, s1, flag, i1, s2);
        a(aoe1, l1, s1, flag, i1, s2, aoh1);
        return Long.valueOf(l2);
    }

    public Object c()
    {
        return i;
    }

    static 
    {
        hik hik = ebw.n;
    }
}
