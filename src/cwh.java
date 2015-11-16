// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class cwh extends cvn
{

    private static final long serialVersionUID = 4L;
    private final byte g[];
    private final ceu h[];

    private cwh(itr itr1)
    {
        Object obj = null;
        super(itr1.responseHeader, -1L);
        Object aobj[];
        if (itr1.b != null)
        {
            aobj = irm.toByteArray(itr1.b);
        } else
        {
            aobj = null;
        }
        g = ((byte []) (aobj));
        aobj = obj;
        if (itr1.b != null)
        {
            aobj = new irm[1];
            aobj[0] = itr1.b;
        }
        h = cvn.a(itr1.e, ((irm []) (aobj)));
        if (cvn.a)
        {
            itr1 = String.valueOf(itr1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(itr1).length() + 29)).append("GetConversationResponse from:").append(itr1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (itr)kop.mergeFrom(new itr(), abyte0);
        if (a(((itr) (abyte0)).responseHeader))
        {
            return new cvz(((itr) (abyte0)).responseHeader);
        } else
        {
            return new cwh(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb1)
    {
        crw crw1;
        super.a(aoe1, dfb1);
        crw1 = crw.a(g, false, c.d);
        if (crw1 == null || crw1.b == null || any.a(aoe1.f(), crw1.b)) goto _L2; else goto _L1
_L1:
        g.a(aoe1.f(), 1839);
_L22:
        return;
_L2:
        Object obj2;
        boolean flag4;
        Object obj;
        String s;
        cuc cuc1;
        Object obj3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        long l3;
        long l5;
        long l6;
        boolean flag5;
        if (crw1 != null)
        {
            s = crw1.a;
            obj = crw1.c;
        } else
        {
            s = "";
            obj = null;
        }
        cuc1 = (cuc)b;
        obj3 = cuc1.r;
        flag5 = cuc1.b;
        if (cuc1.k == null && cuc1.l == 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!TextUtils.isEmpty(cuc1.m))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag5 && obj != null && ((List) (obj)).size() > 0)
        {
            gbh.a("Events were not requested, eventList should be empty");
        }
        if (cuc1.p != null)
        {
            if (cvn.a)
            {
                String s1 = cuc1.p.m;
                long l1 = cuc1.p.e;
                ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 92 + String.valueOf(s1).length())).append("Adding saved pushEvent to GetConversationResponse ").append(s).append(" eventId: ").append(s1).append(" timestamp: ").append(l1).toString());
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
            arraylist.add(cuc1.p);
            obj = arraylist;
        }
        if (ebw.a("Babel", 3))
        {
            if (crw1 != null)
            {
                Object obj1;
                Object obj4;
                String s3;
                int j;
                int k;
                int i1;
                if (((List) (obj)).size() > 0)
                {
                    long l2 = ((cza)((List) (obj)).get(0)).e;
                    long l4 = ((cza)((List) (obj)).get(((List) (obj)).size() - 1)).e;
                    obj1 = (new StringBuilder(60)).append(" earliest: ").append(l2).append(" latest: ").append(l4).toString();
                } else
                {
                    obj1 = "";
                }
                obj4 = String.valueOf("processGetConversationResponse conversationId: ");
                k = ((List) (obj)).size();
                s3 = String.valueOf(Arrays.toString(crw1.e));
                l3 = crw1.f;
                if (h == null)
                {
                    j = 0;
                } else
                {
                    j = h.length;
                }
                ebw.d("Babel", (new StringBuilder(String.valueOf(obj4).length() + 142 + String.valueOf(s).length() + String.valueOf(obj1).length() + String.valueOf(s3).length())).append(((String) (obj4))).append(s).append(" requestedEvents: ").append(flag5).append(" eventCount: ").append(k).append(((String) (obj1))).append(" continuationToken: ").append(s3).append(" continuationEventTimestamp: ").append(l3).append(" num entities: ").append(j).toString());
            } else
            {
                String s2 = String.valueOf("processGetConversationResponse requestedEvents: ");
                ebw.d("Babel", (new StringBuilder(String.valueOf(s2).length() + 5)).append(s2).append(flag5).toString());
            }
        }
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        if (((List) (obj)).size() > 0)
        {
            l3 = ((cza)((List) (obj)).get(0)).e;
        } else
        {
            l3 = 0L;
        }
        flag3 = false;
        if (cvn.j() != null)
        {
            cvn.j().a("get_conversation_response");
        }
        aoe1.a();
        l5 = SystemClock.elapsedRealtime();
        if (obj3 != null && !l.b(((ctv) (obj3)).k))
        {
            g.a(aoe1.f(), 2527);
        }
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_802;
        }
        obj1 = h;
        i1 = obj1.length;
        j = 0;
_L7:
        if (j >= i1) goto _L6; else goto _L5
_L5:
        obj4 = obj1[j];
        if (obj4 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        aoe1.a(((ceu) (obj4)), true);
        j++;
          goto _L7
_L6:
        if (crw1.b == null) goto _L9; else goto _L8
_L8:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1555;
        }
        obj2 = ((ctv) (obj3)).j;
_L26:
        obj3 = crw1.b;
        l6 = crw1.h;
        if (cuc1.r != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        flag4 = any.a(aoe1, ((cyw) (obj3)), l6, ((String) (obj2)), dfb1, null, flag4);
_L25:
        obj2 = ((List) (obj)).iterator();
        flag = false;
_L12:
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_1013;
        }
        obj3 = (cza)((Iterator) (obj2)).next();
        if (!(obj3 instanceof cze)) goto _L11; else goto _L10
_L10:
        flag = true;
_L14:
        flag3 = true;
        any.a(aoe1, ((cza) (obj3)), dfb1, h(), i(), l5 * 1000L);
          goto _L12
_L11:
        if (!(obj3 instanceof crm) || !flag5) goto _L14; else goto _L13
_L13:
label0:
        {
            if (cuc1.k == null)
            {
                break label0;
            }
            ((crm)obj3).a(4);
        }
          goto _L14
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1001;
        }
        a(aoe1.f(), cuc1.m, (crm)obj3);
        ((crm)obj3).a(2);
          goto _L14
        ((crm)obj3).a(5);
          goto _L14
        if (!flag5 || !flag1)
        {
            break MISSING_BLOCK_LABEL_1119;
        }
        l5 = aoe1.O("last_successful_sync_time");
        if (any.a || cvn.a)
        {
            ebw.b("Babel", (new StringBuilder(86)).append("lastSuccessfulSyncTime ").append(l5).append(" oldestEventInListTime ").append(l3).toString());
        }
        if (((List) (obj)).size() <= 0 || l3 <= l5)
        {
            break MISSING_BLOCK_LABEL_1119;
        }
        ebw.c("Babel", "getting rid of older messages");
        aoe1.a(s, Long.valueOf(l3));
        if (!flag2) goto _L16; else goto _L15
_L15:
        if (!any.a) goto _L18; else goto _L17
_L17:
        dfb1 = String.valueOf(s);
        if (dfb1.length() == 0) goto _L20; else goto _L19
_L19:
        dfb1 = "conversation is now synced:".concat(dfb1);
_L23:
        ebw.b("Babel", dfb1);
_L18:
        if (dhl.b(aoe1.f().h()).c(cuc1.m))
        {
            if (any.a || cvn.a)
            {
                ebw.b("Babel", "all conversations now synced");
            }
            l3 = aoe1.O("in_progress_sync_time");
            aoe1.g("last_successful_sync_time", l3);
            aoe1.g("in_progress_sync_time", l3);
        }
_L16:
        if (!flag5)
        {
            break MISSING_BLOCK_LABEL_1246;
        }
        any.a(aoe1, s, crw1.e, crw1.f);
        aoe1.b();
        aoe1.c();
        if (cvn.j() != null)
        {
            cvn.j().a(aoe1.f().h(), "get_conversation_response", SystemClock.elapsedRealtime(), 4);
        }
        if (flag4)
        {
            any.d(aoe1);
        }
        if (flag3)
        {
            any.d(aoe1, s);
        }
        if (flag)
        {
            any.c(aoe1, s);
        }
_L24:
        if (TextUtils.isEmpty(s) || crw1 == null || crw1.b == null || cuc1.o == 0L || cuc1.o == crw1.b.s) goto _L22; else goto _L21
_L21:
        l3 = cuc1.o;
        l5 = crw1.b.s;
        ebw.a("Babel", (new StringBuilder(94)).append("SortTimestamp mismatched (").append(l3).append(" != ").append(l5).append(") forcing immediate SANE").toString());
        RealTimeChatService.a(aoe1.f().h(), false, true, 0, false);
        return;
_L20:
        dfb1 = new String("conversation is now synced:");
          goto _L23
        dfb1;
        aoe1.c();
        if (cvn.j() != null)
        {
            cvn.j().a(aoe1.f().h(), "get_conversation_response", SystemClock.elapsedRealtime(), 4);
        }
        throw dfb1;
_L4:
        if (obj3 != null)
        {
            if (cvn.a)
            {
                ebw.b("Babel", "ProcessGetConversationResponse didn't find conversation");
            }
            if (!l.b(((ctv) (obj3)).k))
            {
                g.a(aoe1.f(), 2528);
            }
            dfb1.a(((dko) (obj3)));
        }
          goto _L24
_L9:
        flag4 = false;
          goto _L25
        obj2 = null;
          goto _L26
    }
}
