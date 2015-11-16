// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class fvm
    implements android.os.Parcelable.Creator
{

    public fvm()
    {
    }

    public static void a(NodeParcelable nodeparcelable, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, nodeparcelable.a);
        g.a(parcel, 2, nodeparcelable.b());
        g.a(parcel, 3, nodeparcelable.c());
        g.b(parcel, 4, nodeparcelable.d());
        g.a(parcel, 5, nodeparcelable.e());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = g.a(parcel);
        int i = 0;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = g.i(parcel, l);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = g.e(parcel, l);
                    break;

                case 5: // '\005'
                    flag = g.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NodeParcelable(j, s1, s, i, flag);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new NodeParcelable[i];
    }
}
