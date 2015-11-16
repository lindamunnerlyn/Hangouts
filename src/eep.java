// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class eep
{

    public static String a;
    private static final int b[] = {
        0x101030e
    };
    private static final hnb c = new hnb("debug.chat.debug_enabled");
    private static boolean d;

    public static int a(String s, String s1)
    {
        int j = 0;
        int i = 0;
        if (s != null)
        {
            int i1 = s1.length();
            j = -i1;
            do
            {
                int k = s.indexOf(s1, j + i1);
                j = i;
                if (k < 0)
                {
                    break;
                }
                i++;
                j = k;
            } while (true);
        }
        return j;
    }

    public static int a(boolean flag)
    {
        return !flag ? 0 : 1;
    }

    public static Spannable a(CharSequence charsequence)
    {
        if (charsequence instanceof Spannable)
        {
            return (Spannable)charsequence;
        } else
        {
            return new SpannableString(charsequence);
        }
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannablestringbuilder, CharSequence charsequence)
    {
        if (a == null)
        {
            a = g.nU.getResources().getString(l.bQ);
        }
        if (spannablestringbuilder.length() != 0)
        {
            spannablestringbuilder.append(a);
        }
        spannablestringbuilder.append(charsequence);
        return spannablestringbuilder;
    }

    public static String a(amx amx1)
    {
label0:
        {
            if (amx1.l())
            {
                String s = String.valueOf("c:");
                amx1 = String.valueOf(amx1.m());
                if (amx1.length() != 0)
                {
                    return s.concat(amx1);
                } else
                {
                    return new String(s);
                }
            }
            if (!amx1.h())
            {
                break label0;
            }
            Iterator iterator = amx1.j().iterator();
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (amw)iterator.next();
            } while (((amw) (obj)).f());
            amx1 = String.valueOf("g:");
            obj = String.valueOf(((amw) (obj)).a());
            if (((String) (obj)).length() != 0)
            {
                return amx1.concat(((String) (obj)));
            } else
            {
                return new String(amx1);
            }
        }
        String s1 = amx1.a().b();
        if (s1 != null)
        {
            amx1 = String.valueOf("p:");
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                return amx1.concat(s1);
            } else
            {
                return new String(amx1);
            }
        }
        s1 = amx1.c();
        if (s1 != null)
        {
            amx1 = String.valueOf("e:");
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                return amx1.concat(s1);
            } else
            {
                return new String(amx1);
            }
        } else
        {
            return null;
        }
    }

    public static String a(String s)
    {
        String s1 = g.a(g.nU, "babel_map_api_key", "AIzaSyBK6MmN29Pi3wq8XFUBhmukENGaH5_tGXw");
        Uri uri;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            if (TextUtils.equals((uri = Uri.parse(s)).getHost(), "maps.googleapis.com") && TextUtils.isEmpty(uri.getQueryParameter("key")) && TextUtils.isEmpty(uri.getQueryParameter("client")))
            {
                return uri.buildUpon().appendQueryParameter("key", s1).build().toString();
            }
        }
        return s;
    }

    public static StringBuilder a(StringBuilder stringbuilder, CharSequence charsequence)
    {
        if (a == null)
        {
            a = g.nU.getResources().getString(l.bQ);
        }
        if (stringbuilder.length() != 0)
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(charsequence);
        return stringbuilder;
    }

    public static void a(int i)
    {
        MediaPlayer mediaplayer;
        try
        {
            mediaplayer = MediaPlayer.create(g.nU, i);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            gdv.a("Exception in MediaPlayer.create");
            eev.e("Babel", "MediaPlayer.create: ", notfoundexception);
            return;
        }
        if (mediaplayer != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        eev.g("Babel", (new StringBuilder(44)).append("Could not create MediaPlayer for ").append(i).toString());
        return;
        mediaplayer.setOnCompletionListener(new eeq());
        mediaplayer.start();
        return;
    }

    public static void a(Context context, String s, Spanned spanned)
    {
        spanned = SpannableString.valueOf(spanned);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(s);
        builder.setMessage(spanned);
        s = builder.create();
        s.show();
        s = (TextView)s.findViewById(0x102000b);
        if (s != null)
        {
            eha.a(context).a(spanned, s);
            Linkify.addLinks(s, 15);
        }
    }

    public static void a(View view, AccessibilityManager accessibilitymanager, CharSequence charsequence)
    {
        Context context = view.getContext().getApplicationContext();
        if (accessibilitymanager == null)
        {
            accessibilitymanager = (AccessibilityManager)context.getSystemService("accessibility");
        }
        if (!accessibilitymanager.isEnabled())
        {
            return;
        }
        AccessibilityEvent accessibilityevent;
        char c1;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            c1 = '\u4000';
        } else
        {
            c1 = '\b';
        }
        accessibilityevent = AccessibilityEvent.obtain(c1);
        accessibilityevent.getText().add(charsequence);
        accessibilityevent.setEnabled(view.isEnabled());
        accessibilityevent.setClassName(view.getClass().getName());
        accessibilityevent.setPackageName(context.getPackageName());
        (new nm(accessibilityevent)).a(view);
        accessibilitymanager.sendAccessibilityEvent(accessibilityevent);
    }

    public static void a(View view, boolean flag)
    {
        android.graphics.drawable.Drawable drawable;
        if (flag)
        {
            TypedArray typedarray = view.getContext().obtainStyledAttributes(b);
            drawable = typedarray.getDrawable(0);
            typedarray.recycle();
        } else
        {
            drawable = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public static void a(TextView textview, View view, int i, int j, int k)
    {
        Resources resources = textview.getResources();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        StringBuilder stringbuilder = new StringBuilder();
        int i1 = spannablestringbuilder.length();
        CharSequence charsequence = resources.getText(i);
        spannablestringbuilder.append(charsequence);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            spannablestringbuilder.setSpan(new TypefaceSpan("sans-serif-medium"), i1, spannablestringbuilder.length(), 33);
        } else
        {
            spannablestringbuilder.setSpan(new TypefaceSpan("sans-serif"), i1, spannablestringbuilder.length(), 33);
            spannablestringbuilder.setSpan(new StyleSpan(1), i1, spannablestringbuilder.length(), 33);
        }
        stringbuilder.append(charsequence);
        if (j != 0)
        {
            spannablestringbuilder.append('\n');
            i = spannablestringbuilder.length();
            CharSequence charsequence1 = resources.getText(j);
            spannablestringbuilder.append(charsequence1);
            spannablestringbuilder.setSpan(new TypefaceSpan("sans-serif"), i, spannablestringbuilder.length(), 33);
            if (k != 0)
            {
                charsequence1 = resources.getText(k);
            }
            a(stringbuilder, charsequence1);
        }
        textview.setText(spannablestringbuilder);
        if (view != null)
        {
            textview = view;
        }
        textview.setContentDescription(stringbuilder.toString());
    }

    public static boolean a()
    {
        return g.a(g.nU, "babel_debugging", false) || ((efu)hlp.a(g.nU, efu)).a();
    }

    public static boolean a(Context context)
    {
        context = (AccessibilityManager)context.getSystemService("accessibility");
        return context != null && context.isEnabled() && context.isTouchExplorationEnabled();
    }

    public static String b(int i)
    {
        Context context = g.nU;
        Resources resources = context.getResources();
        return String.format(Locale.US, "android.resource://%s/%s/%d", new Object[] {
            context.getPackageName(), resources.getResourceTypeName(i), Integer.valueOf(i)
        });
    }

    public static String b(String s)
    {
        if (d)
        {
            return s;
        } else
        {
            return ekw.a(g.nU.getContentResolver()).a(s).a(s);
        }
    }

    public static boolean b()
    {
        gdv.a("Expected condition to be true", true);
        return eev.a(eev.c("randomize")) && Math.random() <= 1.0D;
    }

    public static Uri c(int i)
    {
        return Uri.parse(b(i));
    }

    public static Uri c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public static String c()
    {
        int i = 0;
        Object obj = g.nU.getSharedPreferences("batch_tag_pref", 0);
        int j = ((SharedPreferences) (obj)).getInt("batch_tag", 0);
        if (j != 0x7fffffff)
        {
            i = j + 1;
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt("batch_tag", i);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        return String.valueOf(i);
    }

    public static String d(String s)
    {
        return gf.a().a(s, gq.a);
    }

    public static boolean d()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            boolean flag;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean d(int i)
    {
        return i != 0;
    }

}
