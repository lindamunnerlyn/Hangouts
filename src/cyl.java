// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyl extends cxr
{

    private static final long serialVersionUID = 4L;
    private final byte g[];
    private final cfz h[];

    private cyl(izw izw1)
    {
        Object obj = null;
        super(izw1.responseHeader, -1L);
        Object aobj[];
        if (izw1.b != null)
        {
            aobj = ixr.toByteArray(izw1.b);
        } else
        {
            aobj = null;
        }
        g = ((byte []) (aobj));
        aobj = obj;
        if (izw1.b != null)
        {
            aobj = new ixr[1];
            aobj[0] = izw1.b;
        }
        h = cxr.a(izw1.e, ((ixr []) (aobj)));
        if (cxr.a)
        {
            izw1 = String.valueOf(izw1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(izw1).length() + 29)).append("GetConversationResponse from:").append(izw1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (izw)kws.mergeFrom(new izw(), abyte0);
        if (a(((izw) (abyte0)).responseHeader))
        {
            return new cyd(((izw) (abyte0)).responseHeader);
        } else
        {
            return new cyl(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk1)
    {
        ctz ctz1;
        super.a(aow1, dgk1);
        ctz1 = ctz.a(g, false, c.d);
        if (ctz1 == null || ctz1.b == null || aoq.a(aow1.f(), ctz1.b)) goto _L2; else goto _L1
_L1:
        g.a(aow1.f(), 1839);
_L24:
        return;
_L2:
        Object obj2;
        boolean flag3;
        Object obj;
        String s;
        cwg cwg1;
        Object obj3;
        boolean flag;
        boolean flag1;
        int i1;
        boolean flag2;
        int j1;
        long l3;
        long l5;
        long l6;
        boolean flag4;
        if (ctz1 != null)
        {
            s = ctz1.a;
            obj = ctz1.c;
        } else
        {
            s = "";
            obj = null;
        }
        cwg1 = (cwg)b;
        obj3 = cwg1.r;
        flag4 = cwg1.b;
        if (cwg1.k == null && cwg1.l == 0L)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!TextUtils.isEmpty(cwg1.m))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag4 && obj != null && ((List) (obj)).size() > 0)
        {
            gdv.a("Events were not requested, eventList should be empty");
        }
        if (cwg1.p != null)
        {
            if (cxr.a)
            {
                String s1 = cwg1.p.m;
                long l1 = cwg1.p.e;
                eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 92 + String.valueOf(s1).length())).append("Adding saved pushEvent to GetConversationResponse ").append(s).append(" eventId: ").append(s1).append(" timestamp: ").append(l1).toString());
            }
            int i = 0;
            if (obj != null)
            {
                i = ((List) (obj)).size();
            }
            ArrayList arraylist = new ArrayList(i + 1);
            if (i != 0)
            {
                arraylist.addAll(((java.util.Collection) (obj)));
            }
            arraylist.add(cwg1.p);
            obj = arraylist;
        }
        if (eev.a("Babel", 3))
        {
            if (ctz1 != null)
            {
                Object obj1;
                Object obj4;
                String s3;
                int j;
                int k;
                if (((List) (obj)).size() > 0)
                {
                    long l2 = ((dng)((List) (obj)).get(0)).e;
                    long l4 = ((dng)((List) (obj)).get(((List) (obj)).size() - 1)).e;
                    obj1 = (new StringBuilder(60)).append(" earliest: ").append(l2).append(" latest: ").append(l4).toString();
                } else
                {
                    obj1 = "";
                }
                obj4 = String.valueOf("processGetConversationResponse conversationId: ");
                k = ((List) (obj)).size();
                s3 = String.valueOf(Arrays.toString(ctz1.e));
                l3 = ctz1.f;
                if (h == null)
                {
                    j = 0;
                } else
                {
                    j = h.length;
                }
                eev.d("Babel", (new StringBuilder(String.valueOf(obj4).length() + 142 + String.valueOf(s).length() + String.valueOf(obj1).length() + String.valueOf(s3).length())).append(((String) (obj4))).append(s).append(" requestedEvents: ").append(flag4).append(" eventCount: ").append(k).append(((String) (obj1))).append(" continuationToken: ").append(s3).append(" continuationEventTimestamp: ").append(l3).append(" num entities: ").append(j).toString());
            } else
            {
                String s2 = String.valueOf("processGetConversationResponse requestedEvents: ");
                eev.d("Babel", (new StringBuilder(String.valueOf(s2).length() + 5)).append(s2).append(flag4).toString());
            }
        }
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        if (((List) (obj)).size() > 0)
        {
            l3 = ((dng)((List) (obj)).get(0)).e;
        } else
        {
            l3 = 0L;
        }
        if (cxr.j() != null)
        {
            cxr.j().a("get_conversation_response");
        }
        aow1.a();
        l5 = SystemClock.elapsedRealtime();
        if (obj3 != null && !l.b(((cvz) (obj3)).k))
        {
            g.a(aow1.f(), 2527);
        }
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_799;
        }
        obj1 = h;
        k = obj1.length;
        j = 0;
_L7:
        if (j >= k) goto _L6; else goto _L5
_L5:
        obj4 = obj1[j];
        if (obj4 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        aow1.a(((cfz) (obj4)), true);
        j++;
          goto _L7
_L6:
        if (ctz1.b == null) goto _L9; else goto _L8
_L8:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1650;
        }
        obj2 = ((cvz) (obj3)).j;
_L29:
        obj3 = ctz1.b;
        l6 = ctz1.h;
        if (cwg1.r != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        flag3 = aoq.a(aow1, ((dnc) (obj3)), l6, ((String) (obj2)), dgk1, null, flag3);
_L28:
        if (((List) (obj)).size() <= 0) goto _L11; else goto _L10
_L10:
        aoq.a(aow1, s, 0L, dgk1, null);
        obj2 = new ArrayList();
        flag = false;
        j1 = 0;
        flag1 = false;
_L14:
        if (j1 >= ((List) (obj)).size())
        {
            break MISSING_BLOCK_LABEL_1057;
        }
        obj3 = (dng)((List) (obj)).get(j1);
        ((List) (obj2)).addAll(((dng) (obj3)).a());
        if (!(obj3 instanceof dnk)) goto _L13; else goto _L12
_L12:
        flag = true;
_L16:
        aoq.a(aow1, ((dng) (obj3)), dgk1, h(), i(), l5 * 1000L);
        j1++;
        flag1 = true;
          goto _L14
_L13:
        if (!(obj3 instanceof dmo) || !flag4) goto _L16; else goto _L15
_L15:
label0:
        {
            if (cwg1.k == null)
            {
                break label0;
            }
            ((dmo)obj3).a(4);
        }
          goto _L16
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1045;
        }
        a(aow1.f(), cwg1.m, (dmo)obj3);
        ((dmo)obj3).a(2);
          goto _L16
        ((dmo)obj3).a(5);
          goto _L16
        dgk1.a(g.nU, aow1, s, ((List) (obj2)));
_L27:
        if (!flag4 || !i1)
        {
            break MISSING_BLOCK_LABEL_1185;
        }
        l5 = aoc.a(g.nU, aow1.f().h(), "last_successful_sync_time", 0L);
        if (aoq.a || cxr.a)
        {
            eev.b("Babel", (new StringBuilder(86)).append("lastSuccessfulSyncTime ").append(l5).append(" oldestEventInListTime ").append(l3).toString());
        }
        if (((List) (obj)).size() <= 0 || l3 <= l5)
        {
            break MISSING_BLOCK_LABEL_1185;
        }
        eev.c("Babel", "getting rid of older messages");
        aow1.a(s, Long.valueOf(l3));
        if (!flag2) goto _L18; else goto _L17
_L17:
        if (!aoq.a) goto _L20; else goto _L19
_L19:
        dgk1 = String.valueOf(s);
        if (dgk1.length() == 0) goto _L22; else goto _L21
_L21:
        dgk1 = "conversation is now synced:".concat(dgk1);
_L25:
        eev.b("Babel", dgk1);
_L20:
        if (diu.b(aow1.f().h()).b(cwg1.m))
        {
            if (aoq.a || cxr.a)
            {
                eev.b("Babel", "all conversations now synced");
            }
            i1 = aow1.f().h();
            dgk1 = g.nU;
            l3 = aoc.a(dgk1, i1, "in_progress_sync_time", 0L);
            aoc.b(dgk1, i1, "last_successful_sync_time", l3);
            aoc.b(dgk1, i1, "in_progress_sync_time", l3);
        }
_L18:
        if (!flag4)
        {
            break MISSING_BLOCK_LABEL_1332;
        }
        aoq.a(aow1, s, ctz1.e, ctz1.f);
        aow1.b();
        aow1.c();
        if (cxr.j() != null)
        {
            cxr.j().a(aow1.f().h(), "get_conversation_response", SystemClock.elapsedRealtime(), 4);
        }
        if (flag3)
        {
            aoq.d(aow1);
        }
        if (flag1)
        {
            aoq.d(aow1, s);
        }
        if (flag)
        {
            aoq.c(aow1, s);
        }
_L26:
        if (TextUtils.isEmpty(s) || ctz1 == null || ctz1.b == null || cwg1.o == 0L || cwg1.o == ctz1.b.s) goto _L24; else goto _L23
_L23:
        l3 = cwg1.o;
        l5 = ctz1.b.s;
        eev.a("Babel", (new StringBuilder(94)).append("SortTimestamp mismatched (").append(l3).append(" != ").append(l5).append(") forcing immediate SANE").toString());
        RealTimeChatService.a(aow1.f().h(), false, true, 0, false);
        return;
_L22:
        dgk1 = new String("conversation is now synced:");
          goto _L25
        dgk1;
        aow1.c();
        if (cxr.j() != null)
        {
            cxr.j().a(aow1.f().h(), "get_conversation_response", SystemClock.elapsedRealtime(), 4);
        }
        throw dgk1;
_L4:
        if (obj3 != null)
        {
            if (cxr.a)
            {
                eev.b("Babel", "ProcessGetConversationResponse didn't find conversation");
            }
            if (!l.b(((cvz) (obj3)).k))
            {
                g.a(aow1.f(), 2528);
            }
            dgk1.a(((dmf) (obj3)));
        }
          goto _L26
_L11:
        flag1 = false;
        flag = false;
          goto _L27
_L9:
        flag3 = false;
          goto _L28
        obj2 = null;
          goto _L29
    }
}
