// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.content;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import any;
import aoa;
import aow;
import eev;
import gz;
import java.util.Map;

public class DraftService extends IntentService
{

    private static final boolean a = false;
    private static final gz b = new gz();

    public DraftService()
    {
        super("DraftService");
    }

    public DraftService(String s)
    {
        super(s);
    }

    public static any a(String s, aoa aoa1)
    {
        if (a)
        {
            String s1 = String.valueOf(eev.b(aoa1.a()));
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 52 + String.valueOf(s).length())).append("DraftService.getDraft> accountName=").append(s1).append(", conversationId=").append(s).toString());
        }
        if (TextUtils.isEmpty(s) || aoa1 == null)
        {
            return null;
        }
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        aoa1 = (Map)b.get(Integer.valueOf(aoa1.h()));
        if (aoa1 == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s = (any)aoa1.get(s);
        gz1;
        JVM INSTR monitorexit ;
        return s;
        s;
        gz1;
        JVM INSTR monitorexit ;
        throw s;
        gz1;
        JVM INSTR monitorexit ;
        return null;
    }

    public static void a(Context context, aoa aoa1, String s, any any1)
    {
        Intent intent;
        int i;
        if (a)
        {
            String s1 = String.valueOf(eev.b(aoa1.a()));
            String s2 = String.valueOf(any1);
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 65 + String.valueOf(s).length() + String.valueOf(s2).length())).append("DraftService.saveDraft> accountName=").append(s1).append(", conversationId=").append(s).append(", saveDraft=").append(s2).toString());
        }
        intent = new Intent(context, com/google/android/apps/hangouts/content/DraftService);
        intent.putExtra("conversation_id", s);
        intent.putExtra("draft", any1.b);
        intent.putExtra("draft_subject", any1.c);
        intent.putExtra("draft_attachment_url", any1.d);
        intent.putExtra("draft_photo_rotation", any1.e);
        intent.putExtra("draft_picasa_id", any1.f);
        intent.putExtra("draft_content_type", any1.g);
        i = aoa1.h();
        intent.putExtra("account_id", i);
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        Map map = (Map)b.get(Integer.valueOf(i));
        aoa1 = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        aoa1 = new gz();
        b.put(Integer.valueOf(i), aoa1);
        aoa1.put(s, any1);
        gz1;
        JVM INSTR monitorexit ;
        context.startService(intent);
        return;
        context;
        gz1;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static boolean a()
    {
        return a;
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        } else
        {
            int i = intent.getIntExtra("account_id", -1);
            String s = intent.getStringExtra("conversation_id");
            String s1 = intent.getStringExtra("draft");
            String s2 = intent.getStringExtra("draft_subject");
            String s3 = intent.getStringExtra("draft_attachment_url");
            int j = intent.getIntExtra("draft_photo_rotation", 0);
            String s4 = intent.getStringExtra("draft_picasa_id");
            intent = intent.getStringExtra("draft_content_type");
            (new aow(this, i)).a(s, s1, s2, s3, j, s4, intent);
            return;
        }
    }

    static 
    {
        hnc hnc = eev.d;
    }
}
