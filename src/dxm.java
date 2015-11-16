// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.telecom.ConnectionRequest;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public final class dxm
{

    private final Context a;
    private final int b;
    private boolean c;
    private ArrayList d;

    public dxm(Context context, int i)
    {
        a = context;
        b = i;
        d = new ArrayList();
    }

    private static long a(Context context)
    {
        return g.a(context, "babel_incoming_wifi_call_duplicate_time_millis", 20000L);
    }

    private void a()
    {
        long l = SystemClock.elapsedRealtime();
        long l1 = a(a);
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            long l2 = l - ((eae)iterator.next()).c;
            if (l2 < 0L || l2 >= l1)
            {
                iterator.remove();
            }
        } while (true);
    }

    boolean a(ConnectionRequest connectionrequest, boolean flag)
    {
        Object obj1;
        Object obj2;
        boolean flag1;
        if (!c)
        {
            Object obj = eaj.a(a).d(b);
            if (obj != null)
            {
                byte abyte0[] = Base64.decode(((String) (obj)), 0);
                long l;
                boolean flag2;
                if (abyte0 != null)
                {
                    try
                    {
                        d = new ArrayList(Arrays.asList(((ead)kws.mergeFrom(new ead(), abyte0)).a));
                    }
                    catch (kwr kwr1)
                    {
                        eev.e("Babel_telephony", "TeleDedupeCallLog.readCallLogEntries, unable to parse entries", kwr1);
                    }
                }
            }
            c = true;
        }
        a();
        obj1 = null;
        abyte0 = null;
        if (connectionrequest.getAddress() != null)
        {
            obj1 = connectionrequest.getAddress().getScheme();
            abyte0 = connectionrequest.getAddress().getSchemeSpecificPart();
        }
        connectionrequest = new eae();
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            connectionrequest.a = ((String) (obj1));
        }
        if (!TextUtils.isEmpty(abyte0))
        {
            connectionrequest.b = abyte0;
        }
        connectionrequest.c = SystemClock.elapsedRealtime();
        connectionrequest.d = flag;
        flag2 = false;
        abyte0 = d.listIterator(d.size());
        flag = flag2;
        if (!abyte0.hasPrevious())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (eae)abyte0.previous();
        obj2 = a;
        if (((eae) (connectionrequest)).d != ((eae) (obj1)).d) goto _L2; else goto _L1
_L1:
        eev.e("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, calls are on same network");
        flag1 = false;
_L6:
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = String.valueOf("TeleDedupeCallLog.dedupeIncomingRing, found duplicate ring with start time: ");
        l = ((eae) (obj1)).c;
        eev.f("Babel_telephony", (new StringBuilder(String.valueOf(obj2).length() + 20)).append(((String) (obj2))).append(l).toString());
        abyte0.remove();
        flag = true;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_169;
_L3:
        if (!flag)
        {
            d.add(connectionrequest);
        }
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        long l1;
        long l2;
        if (d.isEmpty())
        {
            eaj.a(a).b(b, null);
            return flag;
        } else
        {
            connectionrequest = new ead();
            connectionrequest.a = (eae[])d.toArray(new eae[d.size()]);
            connectionrequest = Base64.encodeToString(kws.toByteArray(connectionrequest), 0);
            eaj.a(a).b(b, connectionrequest);
            return flag;
        }
_L2:
label0:
        {
            s = ((eae) (connectionrequest)).a;
            s1 = ((eae) (connectionrequest)).b;
            s2 = ((eae) (obj1)).a;
            s3 = ((eae) (obj1)).b;
            s4 = String.valueOf(g.u(s1));
            s5 = String.valueOf(g.u(s3));
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(s4).length() + String.valueOf(s2).length() + String.valueOf(s5).length())).append("TeleDedupeCallLog.arePhoneNumbersLooselyEqual, ").append(s).append(":").append(s4).append(", ").append(s2).append(":").append(s5).toString());
            if (!Objects.equals(s, s2))
            {
                eev.e("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, schemes don't match");
                flag1 = false;
            } else
            if (TextUtils.isEmpty(s1) && TextUtils.isEmpty(s3))
            {
                eev.e("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, both phone numbers are empty, returning true");
                flag1 = true;
            } else
            if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s3))
            {
                eev.e("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, only one phone number is empty");
                flag1 = false;
            } else
            if ("tel".equals(s))
            {
                if (PhoneNumberUtils.compare(s1, s3))
                {
                    break label0;
                }
                eev.e("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, loose comparison of phone numbers failed");
                flag1 = false;
            } else
            {
                if (!s1.equals(s3))
                {
                    break label0;
                }
                eev.e("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, phone numbers are not equal");
                flag1 = false;
            }
        }
_L7:
        if (!flag1)
        {
            eev.e("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, phone numbers are different");
            flag1 = false;
        } else
        {
            l1 = ((eae) (connectionrequest)).c;
            l1 = Math.abs(((eae) (obj1)).c - l1);
            l2 = a(((Context) (obj2)));
            eev.e("Babel_telephony", (new StringBuilder(103)).append("TeleDedupeCallLog.areStartTimesLooselyEqual, delta: ").append(l1).append(" maxDelta: ").append(l2).toString());
            if (l1 < l2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                eev.e("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, start times are different");
                flag1 = false;
            } else
            {
                eev.e("Babel_telephony", "TeleDedupeCallLog.shouldConsiderEntriesAsDuplicate, returning true");
                flag1 = true;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        eev.e("Babel_telephony", "TeleDedupeCallLog.arePhoneNumbersLooselyEqual, returning true");
        flag1 = true;
          goto _L7
    }
}
