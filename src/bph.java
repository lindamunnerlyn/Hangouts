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

public class bph
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new bpi();
    public static final Charset a = Charset.forName("UTF-8");
    private final String b;
    private final String c;
    private String d;
    private String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final Uri j;
    private final String k;
    private final int l;
    private final int m;
    private final String n;
    private final transient PendingIntent o;

    bph(Parcel parcel)
    {
        b = parcel.readString();
        String s2 = parcel.readString();
        String s1 = s2;
        if ("conversation".equals(s2))
        {
            s1 = "conversation";
        }
        c = s1;
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        k = parcel.readString();
        m = parcel.readInt();
        l = parcel.readInt();
        n = parcel.readString();
        o = (PendingIntent)parcel.readParcelable(null);
        j = (Uri)parcel.readParcelable(null);
    }

    bph(String s1, int i1, int j1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, PendingIntent pendingintent, Uri uri)
    {
        if (s2 != null && s3 == null)
        {
            throw new IllegalArgumentException("externalKeyType specified but not externalKey");
        }
        b = s1;
        l = j1;
        m = i1;
        d = s3;
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
            gdv.a("Expected condition to be true", flag);
            c = "conversation";
            e = s3;
        } else
        {
            c = s2;
            e = s4;
        }
        f = s5;
        g = s6;
        h = s7;
        i = s8;
        n = s9;
        o = pendingintent;
        k = s10;
        j = uri;
    }

    public static bph a(SharedPreferences sharedpreferences)
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
            sharedpreferences = new bph(s1, j1, i1, s3, s2, s4, s5, s6, s7, s8, sharedpreferences, s9, null, ((Uri) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            gdv.a("Unexpected");
            return null;
        }
        return sharedpreferences;
    }

    public static bph a(Uri uri, String s1, PendingIntent pendingintent)
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
                    s3 = new String(jyj.b().a(as[0]), a);
                    s2 = Uri.decode(as[1]);
                }
            }
            if (obj3 == null && obj1 == null)
            {
                uri = String.valueOf(uri);
                gne.a(5, "vclib", (new StringBuilder(String.valueOf(uri).length() + 27)).append("Could not parse ").append(uri).append(i1).toString());
                return null;
            } else
            {
                return new bph(s1, 1, 1, ((String) (obj)), ((String) (obj1)), null, ((String) (obj2)), ((String) (obj3)), s3, s2, null, null, pendingintent, uri);
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
        break MISSING_BLOCK_LABEL_799;
_L2:
        break MISSING_BLOCK_LABEL_89;
    }

    public String a()
    {
        return b;
    }

    void a(android.content.SharedPreferences.Editor editor)
    {
        editor.putString("ACCOUNT_NAME", b);
        editor.putInt("CALL_MEDIA_TYPE", l);
        editor.putString("EXTERNAL_KEY", d);
        editor.putString("EXTERNAL_KEY_TYPE", c);
        editor.putString("CONVERSATION_ID", e);
        editor.putString("INFO_HANGOUT_DOMAIN", f);
        editor.putString("INFO_HANGOUT_ID", g);
        editor.putString("INFO_CALENDAR_ID", h);
        editor.putString("INFO_EVENT_ID", i);
        editor.putString("PENDING_HANGOUT_ID_KEY", k);
        editor.putInt("HANGOUT_TYPE", m);
        editor.putString("INFO_INVITEE_NICK", n);
        String s1;
        if (j != null)
        {
            s1 = j.toString();
        } else
        {
            s1 = null;
        }
        editor.putString("ORIGINAL_URI", s1);
    }

    public void a(String s1)
    {
        d = s1;
    }

    public bph b(String s1)
    {
        return new bph(b, m, l, null, null, null, f, g, h, i, g.B(s1), null, null, j);
    }

    public String b()
    {
        return c;
    }

    public bph c(String s1)
    {
        boolean flag;
        if (d == null && c == null && o == null && k == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        if (b != null && b.equals(s1))
        {
            return this;
        } else
        {
            return new bph(s1, m, l, null, null, null, f, g, h, i, null, null, null, j);
        }
    }

    public boolean c()
    {
        return d != null;
    }

    public Object clone()
    {
        return r();
    }

    public bph d(String s1)
    {
        return new bph(b, m, l, c, d, null, null, s1, h, i, n, null, o, j);
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public bph e(String s1)
    {
        gdv.b("Expected non-null", g);
        if ("conversation".equals(c))
        {
            if (s1 == null && g == null && (c == null || "conversation".equals(c)))
            {
                throw new IllegalStateException("Erasing the only data of conv id");
            }
            String s3 = b;
            int i1 = m;
            int j1 = l;
            String s2;
            if (s1 == null)
            {
                s2 = null;
            } else
            {
                s2 = "conversation";
            }
            return new bph(s3, i1, j1, s2, s1, s1, f, g, h, i, n, null, o, j);
        } else
        {
            return new bph(b, m, l, c, d, s1, f, g, h, i, n, null, o, j);
        }
    }

    public String e()
    {
        return e;
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
        obj = (bph)obj;
        flag2 = flag3;
        if (!b.equals(((bph) (obj)).b)) goto _L4; else goto _L6
_L6:
        int i1;
        int j1;
        if (m == 4)
        {
            i1 = 1;
        } else
        {
            i1 = m;
        }
        if (((bph) (obj)).m == 4)
        {
            j1 = 1;
        } else
        {
            j1 = ((bph) (obj)).m;
        }
        flag2 = flag3;
        if (i1 != j1) goto _L4; else goto _L7
_L7:
        boolean flag;
        boolean flag1;
        if (c != null && c.equals(((bph) (obj)).c) && d.equals(((bph) (obj)).d))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (e != null && e.equals(((bph) (obj)).e))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (g != null && g.equals(((bph) (obj)).g) && (f == null && ((bph) (obj)).f == null || f != null && f.equals(((bph) (obj)).f)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k != null && k.equals(((bph) (obj)).k))
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
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public int hashCode()
    {
        return (b.hashCode() + 31) * 31 + m;
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return k;
    }

    public Uri k()
    {
        return j;
    }

    public int l()
    {
        return l;
    }

    public int m()
    {
        return m;
    }

    public String n()
    {
        return n;
    }

    public PendingIntent o()
    {
        return o;
    }

    public boolean p()
    {
        return g == null && c == null;
    }

    public boolean q()
    {
        return !TextUtils.isEmpty(g) && !TextUtils.isEmpty(f);
    }

    public bph r()
    {
        return new bph(b, m, l, c, d, e, f, g, h, i, n, k, o, j);
    }

    public void s()
    {
        if (o == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        o.send();
        return;
        android.app.PendingIntent.CanceledException canceledexception;
        canceledexception;
        gne.a(5, "vclib", "HangoutRequest call complete intent could not be sent", canceledexception);
        return;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("HangoutRequest{ account=").append(gne.a(b)).append(", ");
        stringbuilder.append("callMediaType=").append(l).append(", ");
        if (c != null)
        {
            if (!"conversation".equals(c))
            {
                stringbuilder.append("extKey=").append(c).append(':').append(d).append(", ");
            }
            stringbuilder.append("convId=").append(e).append(", ");
        }
        if (g != null)
        {
            stringbuilder.append("hangoutId=").append(f).append(':').append(gne.a(g)).append(", ");
        }
        if (h != null && i != null)
        {
            stringbuilder.append("calendarId=").append(h).append(':').append(i).append(", ");
        }
        if (k != null)
        {
            stringbuilder.append("pendingIdKey=").append(gne.a(k)).append(' ');
        }
        if (n != null)
        {
            stringbuilder.append("inviteeNick=").append(gne.a(n)).append(' ');
        }
        if (j != null)
        {
            stringbuilder.append("originalUri=").append(j.toString()).append(' ');
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(k);
        parcel.writeInt(m);
        parcel.writeInt(l);
        parcel.writeString(n);
        parcel.writeParcelable(o, i1);
        parcel.writeParcelable(j, i1);
    }

}
