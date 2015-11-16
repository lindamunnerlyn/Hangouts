// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.List;

public class boy
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new boz();
    public static final Charset a = Charset.forName("UTF-8");
    public static final String b = "conversation";
    private final String c;
    private final String d;
    private String e;
    private String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Uri k;
    private final String l;
    private final int m;
    private final int n;
    private final String o;
    private final transient PendingIntent p;

    boy(Parcel parcel)
    {
        c = parcel.readString();
        String s2 = parcel.readString();
        String s1 = s2;
        if ("conversation".equals(s2))
        {
            s1 = "conversation";
        }
        d = s1;
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readString();
        l = parcel.readString();
        n = parcel.readInt();
        m = parcel.readInt();
        o = parcel.readString();
        p = (PendingIntent)parcel.readParcelable(null);
        k = (Uri)parcel.readParcelable(null);
    }

    boy(String s1, int i1, int j1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, PendingIntent pendingintent, Uri uri)
    {
        if (s2 != null && s3 == null)
        {
            throw new IllegalArgumentException("externalKeyType specified but not externalKey");
        }
        c = s1;
        m = j1;
        n = i1;
        e = s3;
        if ("conversation".equals(s2))
        {
            boolean flag;
            if (s4 == null || s4.equals(s3))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            d = "conversation";
            f = s3;
        } else
        {
            d = s2;
            f = s4;
        }
        g = s5;
        h = s6;
        i = s7;
        j = s8;
        o = s9;
        p = pendingintent;
        l = s10;
        k = uri;
    }

    static boy a(SharedPreferences sharedpreferences)
    {
        String s1 = sharedpreferences.getString("ACCOUNT_NAME", null);
        int i1 = sharedpreferences.getInt("CALL_MEDIA_TYPE", 1);
        String s2 = sharedpreferences.getString("EXTERNAL_KEY", null);
        String s3 = sharedpreferences.getString("EXTERNAL_KEY_TYPE", null);
        String s4 = sharedpreferences.getString("CONVERSATION_ID", null);
        String s5 = sharedpreferences.getString("INFO_HANGOUT_DOMAIN", null);
        String s6 = sharedpreferences.getString("INFO_HANGOUT_ID", null);
        String s7 = sharedpreferences.getString("INFO_CALENDAR_ID", null);
        String s8 = sharedpreferences.getString("INFO_EVENT_ID", null);
        String s9 = sharedpreferences.getString("PENDING_HANGOUT_ID_KEY", null);
        Object obj = sharedpreferences.getString("ORIGINAL_URI", null);
        int j1;
        if (obj != null)
        {
            obj = Uri.parse(((String) (obj)));
        } else
        {
            obj = null;
        }
        j1 = sharedpreferences.getInt("HANGOUT_TYPE", 1);
        sharedpreferences = sharedpreferences.getString("INFO_INVITEE_NICK", null);
        try
        {
            sharedpreferences = new boy(s1, j1, i1, s3, s2, s4, s5, s6, s7, s8, sharedpreferences, s9, null, ((Uri) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            gbh.a("Unexpected");
            return null;
        }
        return sharedpreferences;
    }

    public static boy a(Uri uri, String s1, PendingIntent pendingintent)
    {
label0:
        {
            {
                if (uri == null)
                {
                    return null;
                }
                Object obj3 = null;
                Object obj2 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj1 = uri.getPathSegments();
                int i1 = ((List) (obj1)).size();
                if (i1 != 2)
                {
                    break label0;
                }
                obj2 = (String)((List) (obj1)).get(0);
                Object obj = (String)((List) (obj1)).get(1);
                String s2;
                String s3;
                String s4;
                String as[];
                if ("hangouts".equals(obj2))
                {
                    obj1 = null;
                    Object obj4 = null;
                    obj2 = null;
                    obj3 = obj;
                    obj = obj4;
                } else
                {
                    if (!"call".equals(obj2))
                    {
                        obj = null;
                    }
                    obj1 = null;
                    s2 = null;
                    obj3 = obj;
                    obj2 = null;
                    obj = s2;
                }
            }
            s4 = uri.getQueryParameter("hceid");
            s3 = obj5;
            s2 = obj6;
            if (!TextUtils.isEmpty(s4))
            {
                as = s4.split("\\.");
                s3 = obj5;
                s2 = obj6;
                if (as.length == 2)
                {
                    s3 = new String(jra.b().a(as[0]), a);
                    s2 = Uri.decode(as[1]);
                }
            }
            if (obj3 == null && obj1 == null)
            {
                uri = String.valueOf(uri);
                gkc.d("vclib", (new StringBuilder(String.valueOf(uri).length() + 27)).append("Could not parse ").append(uri).append(i1).toString());
                return null;
            } else
            {
                return new boy(s1, 1, 1, ((String) (obj)), ((String) (obj1)), null, ((String) (obj2)), ((String) (obj3)), s3, s2, null, null, pendingintent, uri);
            }
        }
        if (i1 == 3)
        {
            obj3 = (String)((List) (obj1)).get(0);
            s2 = (String)((List) (obj1)).get(1);
            obj1 = (String)((List) (obj1)).get(2);
            if ("talkgadget".equals(obj3) && "hangout".equals(s2))
            {
                obj2 = null;
                obj = null;
                obj3 = obj1;
                s2 = null;
                obj1 = obj2;
                obj2 = s2;
            } else
            {
                obj = obj2;
                if (((String) (obj3)).equals("hangouts"))
                {
                    obj = obj2;
                    if (s2.equals("_"))
                    {
                        obj = obj1;
                    }
                }
                obj1 = null;
                obj3 = obj;
                s2 = null;
                obj2 = null;
                obj = obj1;
                obj1 = s2;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 4)
        {
            s2 = (String)((List) (obj1)).get(0);
            obj2 = (String)((List) (obj1)).get(1);
            obj = (String)((List) (obj1)).get(2);
            obj1 = (String)((List) (obj1)).get(3);
            if ("hangouts".equals(s2) && "_".equals(obj2))
            {
                if ("lite".equals(obj))
                {
                    obj2 = null;
                    obj = null;
                    obj3 = obj1;
                    s2 = null;
                    obj1 = obj2;
                    obj2 = s2;
                } else
                if (((String) (obj)).indexOf('.') != -1)
                {
                    obj3 = Uri.decode(((String) (obj1)));
                    obj1 = null;
                    s2 = null;
                    obj2 = obj;
                    obj = obj1;
                    obj1 = s2;
                } else
                {
                    obj3 = null;
                    obj2 = null;
                }
            } else
            if ("call".equals(s2) && ((String) (obj2)).indexOf('.') != 1)
            {
                obj1 = null;
                s2 = null;
                obj3 = obj;
                obj = s2;
            } else
            {
                if ("hangouts".equals(s2) && "extras".equals(obj2))
                {
                    obj1 = Uri.decode(((String) (obj1)));
                } else
                {
                    obj = null;
                    obj1 = obj3;
                }
                s2 = null;
                obj3 = obj1;
                obj1 = null;
                obj2 = obj;
                obj = s2;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 5)
        {
            obj = (String)((List) (obj1)).get(0);
            obj3 = (String)((List) (obj1)).get(1);
            s2 = (String)((List) (obj1)).get(2);
            obj2 = (String)((List) (obj1)).get(3);
            obj1 = (String)((List) (obj1)).get(4);
            if ("hangouts".equals(obj) && "_".equals(obj3) && ("extras".equals(s2) || "meet".equals(s2)))
            {
                obj3 = Uri.decode(((String) (obj1)));
                obj = null;
                obj1 = null;
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = null;
        obj3 = null;
        obj1 = null;
        obj2 = null;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_795;
_L2:
        break MISSING_BLOCK_LABEL_89;
    }

    public String a()
    {
        return c;
    }

    void a(android.content.SharedPreferences.Editor editor)
    {
        editor.putString("ACCOUNT_NAME", c);
        editor.putInt("CALL_MEDIA_TYPE", m);
        editor.putString("EXTERNAL_KEY", e);
        editor.putString("EXTERNAL_KEY_TYPE", d);
        editor.putString("CONVERSATION_ID", f);
        editor.putString("INFO_HANGOUT_DOMAIN", g);
        editor.putString("INFO_HANGOUT_ID", h);
        editor.putString("INFO_CALENDAR_ID", i);
        editor.putString("INFO_EVENT_ID", j);
        editor.putString("PENDING_HANGOUT_ID_KEY", l);
        editor.putInt("HANGOUT_TYPE", n);
        editor.putString("INFO_INVITEE_NICK", o);
        String s1;
        if (k != null)
        {
            s1 = k.toString();
        } else
        {
            s1 = null;
        }
        editor.putString("ORIGINAL_URI", s1);
    }

    public void a(String s1)
    {
        e = s1;
    }

    public boy b(String s1)
    {
        return new boy(c, n, m, null, null, null, g, h, i, j, g.y(s1), null, null, k);
    }

    public String b()
    {
        return d;
    }

    public boy c(String s1)
    {
        boolean flag;
        if (e == null && d == null && p == null && l == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        if (c != null && c.equals(s1))
        {
            return this;
        } else
        {
            return new boy(s1, n, m, null, null, null, g, h, i, j, null, null, null, k);
        }
    }

    public boolean c()
    {
        return e != null;
    }

    public Object clone()
    {
        return r();
    }

    public boy d(String s1)
    {
        return new boy(c, n, m, d, e, null, null, s1, i, j, o, null, p, k);
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boy e(String s1)
    {
        gbh.b(h);
        if ("conversation".equals(d))
        {
            if (s1 == null && h == null && (d == null || "conversation".equals(d)))
            {
                throw new IllegalStateException("Erasing the only data of conv id");
            }
            String s3 = c;
            int i1 = n;
            int j1 = m;
            String s2;
            if (s1 == null)
            {
                s2 = null;
            } else
            {
                s2 = b;
            }
            return new boy(s3, i1, j1, s2, s1, s1, g, h, i, j, o, null, p, k);
        } else
        {
            return new boy(c, n, m, d, e, s1, g, h, i, j, o, null, p, k);
        }
    }

    public String e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        boolean flag3 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag3;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (getClass() != obj.getClass()) goto _L4; else goto _L5
_L5:
        obj = (boy)obj;
        flag2 = flag3;
        if (!c.equals(((boy) (obj)).c)) goto _L4; else goto _L6
_L6:
        int i1;
        int j1;
        if (n == 4)
        {
            i1 = 1;
        } else
        {
            i1 = n;
        }
        if (((boy) (obj)).n == 4)
        {
            j1 = 1;
        } else
        {
            j1 = ((boy) (obj)).n;
        }
        flag2 = flag3;
        if (i1 != j1) goto _L4; else goto _L7
_L7:
        boolean flag;
        boolean flag1;
        if (d != null && d.equals(((boy) (obj)).d) && e.equals(((boy) (obj)).e))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f != null && f.equals(((boy) (obj)).f))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (h != null && h.equals(((boy) (obj)).h) && (g == null && ((boy) (obj)).g == null || g != null && g.equals(((boy) (obj)).g)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l != null && l.equals(((boy) (obj)).l))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i1 != 0 || j1 != 0 || flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!flag1) goto _L4; else goto _L8
_L8:
        return true;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public String h()
    {
        return i;
    }

    public int hashCode()
    {
        return (c.hashCode() + 31) * 31 + n;
    }

    public String i()
    {
        return j;
    }

    public String j()
    {
        return l;
    }

    public Uri k()
    {
        return k;
    }

    public int l()
    {
        return m;
    }

    public int m()
    {
        return n;
    }

    public String n()
    {
        return o;
    }

    public PendingIntent o()
    {
        return p;
    }

    public boolean p()
    {
        return h == null && d == null;
    }

    public boolean q()
    {
        return !TextUtils.isEmpty(h) && !TextUtils.isEmpty(g);
    }

    public boy r()
    {
        return new boy(c, n, m, d, e, f, g, h, i, j, o, l, p, k);
    }

    public void s()
    {
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        p.send();
        return;
        android.app.PendingIntent.CanceledException canceledexception;
        canceledexception;
        gkc.a("vclib", "HangoutRequest call complete intent could not be sent", canceledexception);
        return;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("HangoutRequest{ account=").append(gkc.b(c)).append(", ");
        stringbuilder.append("callMediaType=").append(m).append(", ");
        if (d != null)
        {
            if (!"conversation".equals(d))
            {
                stringbuilder.append("extKey=").append(d).append(':').append(e).append(", ");
            }
            stringbuilder.append("convId=").append(f).append(", ");
        }
        if (h != null)
        {
            stringbuilder.append("hangoutId=").append(g).append(':').append(gkc.b(h)).append(", ");
        }
        if (i != null && j != null)
        {
            stringbuilder.append("calendarId=").append(i).append(':').append(j).append(", ");
        }
        if (l != null)
        {
            stringbuilder.append("pendingIdKey=").append(gkc.b(l)).append(' ');
        }
        if (o != null)
        {
            stringbuilder.append("inviteeNick=").append(gkc.b(o)).append(' ');
        }
        if (k != null)
        {
            stringbuilder.append("originalUri=").append(k.toString()).append(' ');
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        parcel.writeString(l);
        parcel.writeInt(n);
        parcel.writeInt(m);
        parcel.writeString(o);
        parcel.writeParcelable(p, i1);
        parcel.writeParcelable(k, i1);
    }

}
