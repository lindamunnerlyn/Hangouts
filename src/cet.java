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

final class cet
{

    cet()
    {
    }

    static void a(Context context, int i, boolean flag)
    {
        aoa aoa1 = dcn.e(i);
        if (!aoa1.o()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        Object obj2;
        int j;
        long l;
        long l1;
        LinkedList linkedlist = new LinkedList();
        obj1 = aoc.e(context, i).b;
        obj2 = EsProvider.a(EsProvider.j, i);
        LinkedList linkedlist1 = new LinkedList();
        edb edb1 = new edb();
        l = 0L;
        Object obj;
        Cursor cursor;
        if (IncomingRing.a() != null)
        {
            obj = IncomingRing.a().f().e();
        } else
        {
            bnk.a();
            String s;
            String s1;
            int k;
            long l2;
            boolean flag1;
            if (bnk.c())
            {
                obj = bnk.a().s();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((bpm) (obj)).e().e();
                }
            } else
            {
                obj = null;
            }
        }
        cursor = context.getContentResolver().query(((android.net.Uri) (obj2)), ces.a, ces.b, new String[] {
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
        if (cep.a)
        {
            eev.b("Babel", "no unseen hangout notifications");
        }
        if (cursor == null) goto _L1; else goto _L3
_L3:
        cursor.close();
        return;
        if (cep.a)
        {
            eev.b("Babel", "Some unseen hangout notifications");
        }
          goto _L4
_L12:
        obj2 = cursor.getString(2);
        k = cursor.getInt(8);
        if (cep.a)
        {
            eev.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 51 + String.valueOf(obj2).length())).append("[HangoutNotifications] conversationId: ").append(((String) (obj1))).append(" newConvId: ").append(((String) (obj2))).toString());
        }
        if (TextUtils.equals(((CharSequence) (obj2)), ((CharSequence) (obj1)))) goto _L6; else goto _L5
_L5:
        j = cursor.getInt(5);
        l2 = cursor.getLong(6) / 1000L;
        if (!TextUtils.equals(((CharSequence) (obj2)), ((CharSequence) (obj)))) goto _L8; else goto _L7
_L7:
        if (!cep.a) goto _L10; else goto _L9
_L9:
        eev.b("Babel", (new StringBuilder(String.valueOf(obj2).length() + 85)).append("[HangoutNotifications]  newConvId: ").append(((String) (obj2))).append(" ignored because of active ring or joined hangout.").toString());
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
        if (edb1.size() > 0)
        {
            (new cfe(context, i, edb1, j, linkedlist1, l)).a(flag);
        } else
        {
            cfe.b(context, i);
        }
        cfn.a(context, i, linkedlist);
        return;
_L8:
        if (cursor.getInt(1) != dsv.h.ordinal() || aoa1.l())
        {
            break MISSING_BLOCK_LABEL_556;
        }
        s1 = cef.a(cursor, 3, 4);
        s = cursor.getString(0);
        obj1 = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_510;
        }
        obj1 = "...";
        Log.wtf("Babel", "Should at least have a fallback name for the inviter");
        obj1 = new cfn(context, i, s1, ((String) (obj2)), j, ((String) (obj1)), l2, k);
        linkedlist.add(obj1);
        ((cfn) (obj1)).a(flag);
        l1 = l;
        break MISSING_BLOCK_LABEL_685;
        obj1 = g.a(aoa1, cursor.getString(7), true);
        flag1 = false;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_595;
        }
        flag1 = ((List) (obj1)).contains(aoc.e(context, i));
        if (flag1) goto _L10; else goto _L13
_L13:
        linkedlist1.add(cef.a(cursor, 3, 4));
        edb1.add(obj2);
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
