// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import java.util.LinkedList;
import java.util.List;

final class cdo
{

    cdo()
    {
    }

    static void a(Context context, int i, boolean flag)
    {
        ani ani1 = dbf.e(i);
        if (!ani1.q()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        Object obj2;
        int j;
        long l;
        long l1;
        LinkedList linkedlist = new LinkedList();
        obj1 = ank.e(context, i).b;
        obj2 = EsProvider.a(EsProvider.j, i);
        LinkedList linkedlist1 = new LinkedList();
        dzx dzx1 = new dzx();
        l = 0L;
        Object obj;
        Cursor cursor;
        if (IncomingRing.a() != null)
        {
            obj = IncomingRing.a().e().e();
        } else
        {
            bnd.a();
            String s;
            String s1;
            int k;
            long l2;
            boolean flag1;
            if (bnd.c())
            {
                obj = bnd.a().t();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((bpd) (obj)).e().e();
                }
            } else
            {
                obj = null;
            }
        }
        cursor = context.getContentResolver().query(((android.net.Uri) (obj2)), cdn.a, cdn.b, new String[] {
            obj1
        }, "merge_key, timestamp DESC");
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (cdk.a)
        {
            ebw.b("Babel", "no unseen hangout notifications");
        }
        if (cursor == null) goto _L1; else goto _L3
_L3:
        cursor.close();
        return;
        if (cdk.a)
        {
            ebw.b("Babel", "Some unseen hangout notifications");
        }
          goto _L4
_L12:
        obj2 = cursor.getString(2);
        k = cursor.getInt(8);
        if (cdk.a)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 51 + String.valueOf(obj2).length())).append("[HangoutNotifications] conversationId: ").append(((String) (obj1))).append(" newConvId: ").append(((String) (obj2))).toString());
        }
        if (TextUtils.equals(((CharSequence) (obj2)), ((CharSequence) (obj1)))) goto _L6; else goto _L5
_L5:
        j = cursor.getInt(5);
        l2 = cursor.getLong(6) / 1000L;
        if (!TextUtils.equals(((CharSequence) (obj2)), ((CharSequence) (obj)))) goto _L8; else goto _L7
_L7:
        if (!cdk.a) goto _L10; else goto _L9
_L9:
        ebw.b("Babel", (new StringBuilder(String.valueOf(obj2).length() + 85)).append("[HangoutNotifications]  newConvId: ").append(((String) (obj2))).append(" ignored because of active ring or joined hangout.").toString());
        l1 = l;
        break MISSING_BLOCK_LABEL_685;
_L6:
        flag1 = cursor.moveToNext();
        if (flag1) goto _L12; else goto _L11
_L11:
        if (cursor != null)
        {
            cursor.close();
        }
        if (dzx1.size() > 0)
        {
            (new cdz(context, i, dzx1, j, linkedlist1, l)).a(flag);
        } else
        {
            cdz.b(context, i);
        }
        cei.a(context, i, linkedlist);
        return;
_L8:
        if (cursor.getInt(1) != dqc.h.ordinal() || ani1.n())
        {
            break MISSING_BLOCK_LABEL_556;
        }
        s1 = cda.a(cursor, 3, 4);
        s = cursor.getString(0);
        obj1 = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_510;
        }
        obj1 = "...";
        Log.wtf("Babel", "Should at least have a fallback name for the inviter");
        obj1 = new cei(context, i, s1, ((String) (obj2)), j, ((String) (obj1)), l2, k);
        linkedlist.add(obj1);
        ((cei) (obj1)).a(flag);
        l1 = l;
        break MISSING_BLOCK_LABEL_685;
        obj1 = g.a(ani1, cursor.getString(7), true);
        flag1 = false;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_595;
        }
        flag1 = ((List) (obj1)).contains(ank.e(context, i));
        if (flag1) goto _L10; else goto _L13
_L13:
        linkedlist1.add(cda.a(cursor, 3, 4));
        dzx1.add(obj2);
        l1 = l2;
        if (l2 > l)
        {
            break MISSING_BLOCK_LABEL_685;
        }
_L10:
        l1 = l;
        break MISSING_BLOCK_LABEL_685;
        context;
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
_L4:
        obj1 = null;
        j = 1;
          goto _L12
        obj1 = obj2;
        l = l1;
          goto _L6
    }
}
