// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.content;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import ang;
import ani;
import aoe;
import ebw;
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

    public static ang a(String s, ani ani1)
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(ani1.a()));
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 52 + String.valueOf(s).length())).append("DraftService.getDraft> accountName=").append(s1).append(", conversationId=").append(s).toString());
        }
        if (TextUtils.isEmpty(s) || ani1 == null)
        {
            return null;
        }
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        ani1 = (Map)b.get(Integer.valueOf(ani1.h()));
        if (ani1 == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s = (ang)ani1.get(s);
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

    public static void a(Context context, ani ani1, String s, ang ang1)
    {
        Intent intent;
        int i;
        if (a)
        {
            String s1 = String.valueOf(ebw.b(ani1.a()));
            String s2 = String.valueOf(ang1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 65 + String.valueOf(s).length() + String.valueOf(s2).length())).append("DraftService.saveDraft> accountName=").append(s1).append(", conversationId=").append(s).append(", saveDraft=").append(s2).toString());
        }
        intent = new Intent(context, com/google/android/apps/hangouts/content/DraftService);
        intent.putExtra("conversation_id", s);
        intent.putExtra("draft", ang1.b);
        intent.putExtra("draft_subject", ang1.c);
        intent.putExtra("draft_attachment_url", ang1.d);
        intent.putExtra("draft_photo_rotation", ang1.e);
        intent.putExtra("draft_picasa_id", ang1.f);
        intent.putExtra("draft_content_type", ang1.g);
        i = ani1.h();
        intent.putExtra("account_id", i);
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        Map map = (Map)b.get(Integer.valueOf(i));
        ani1 = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        ani1 = new gz();
        b.put(Integer.valueOf(i), ani1);
        ani1.put(s, ang1);
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
            (new aoe(this, i)).a(s, s1, s2, s3, j, s4, intent);
            return;
        }
    }

    static 
    {
        hik hik = ebw.d;
    }
}
