// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bej
{

    static boolean a = false;
    private static final Pattern b = Pattern.compile("\\*#\\*#(.*)#\\*#\\*");
    private static final boolean c = false;

    public static boolean a(Context context, CharSequence charsequence)
    {
label0:
        {
            if (!c && !a || charsequence == null)
            {
                return false;
            }
            charsequence = b.matcher(charsequence);
            if (!charsequence.matches())
            {
                break label0;
            }
            charsequence = charsequence.group(1);
            Iterator iterator = hlp.c(context, bei).iterator();
            bei bei1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                bei1 = (bei)iterator.next();
            } while (!bei1.a(charsequence));
            bei1.a(context);
            return true;
        }
        return false;
    }

    static 
    {
        new hnc("debug.chat.debug");
    }
}
