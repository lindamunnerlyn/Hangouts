// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class bkf
    implements Runnable
{

    final bke a;

    bkf(bke bke1)
    {
        a = bke1;
        super();
    }

    public void run()
    {
        Object obj = bke.c();
        obj;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        Iterator iterator;
        stringbuilder = new StringBuilder();
        iterator = bke.b(a).iterator();
        boolean flag = true;
_L2:
        Integer integer;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        integer = (Integer)iterator.next();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        stringbuilder.append(",");
        stringbuilder.append(Integer.toString(g.a(integer, 0), bke.b()));
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        android.content.SharedPreferences.Editor editor = bke.a(a).getSharedPreferences("recentEmoji", 0).edit();
        editor.putString("recentEmojiKey", stringbuilder.toString());
        editor.apply();
        (new BackupManager(bke.a(a))).dataChanged();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
