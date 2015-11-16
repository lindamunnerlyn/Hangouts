// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eig extends Enum
{

    public static final eig A;
    public static final eig B;
    public static final eig C;
    public static final eig D;
    public static final eig E;
    public static final eig F;
    public static final eig G;
    public static final eig H;
    public static final eig I;
    public static final eig J;
    public static final eig K;
    public static final eig L;
    public static final eig M;
    public static final eig N;
    public static final eig O;
    public static final eig P;
    public static final eig Q;
    public static final eig R;
    public static final eig S;
    public static final eig T;
    public static final eig U;
    public static final eig V;
    private static final eig X[];
    public static final eig a;
    public static final eig b;
    public static final eig c;
    public static final eig d;
    public static final eig e;
    public static final eig f;
    public static final eig g;
    public static final eig h;
    public static final eig i;
    public static final eig j;
    public static final eig k;
    public static final eig l;
    public static final eig m;
    public static final eig n;
    public static final eig o;
    public static final eig p;
    public static final eig q;
    public static final eig r;
    public static final eig s;
    public static final eig t;
    public static final eig u;
    public static final eig v;
    public static final eig w;
    public static final eig x;
    public static final eig y;
    public static final eig z;
    private final String W;

    private eig(String s1, int i1, String s2)
    {
        super(s1, i1);
        W = s2;
    }

    public static eig valueOf(String s1)
    {
        return (eig)Enum.valueOf(eig, s1);
    }

    public static eig[] values()
    {
        return (eig[])X.clone();
    }

    public String a()
    {
        return W;
    }

    static 
    {
        a = new eig("SUCCESS", 0, "Ok");
        b = new eig("BAD_AUTHENTICATION", 1, "BadAuthentication");
        c = new eig("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        d = new eig("NEEDS_2F", 3, "InvalidSecondFactor");
        e = new eig("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        f = new eig("NOT_VERIFIED", 5, "NotVerified");
        g = new eig("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        h = new eig("UNKNOWN", 7, "Unknown");
        i = new eig("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        j = new eig("ACCOUNT_DELETED", 9, "AccountDeleted");
        k = new eig("ACCOUNT_DISABLED", 10, "AccountDisabled");
        l = new eig("SERVICE_DISABLED", 11, "ServiceDisabled");
        m = new eig("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        n = new eig("CAPTCHA", 13, "CaptchaRequired");
        o = new eig("NETWORK_ERROR", 14, "NetworkError");
        p = new eig("USER_CANCEL", 15, "UserCancel");
        q = new eig("PERMISSION_DENIED", 16, "PermissionDenied");
        r = new eig("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        s = new eig("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        t = new eig("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        u = new eig("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        v = new eig("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        w = new eig("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        x = new eig("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        y = new eig("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        z = new eig("DM_REQUIRED", 25, "DeviceManagementRequired");
        A = new eig("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        B = new eig("NEED_PERMISSION", 27, "NeedPermission");
        C = new eig("BAD_PASSWORD", 28, "WeakPassword");
        D = new eig("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        E = new eig("BAD_REQUEST", 30, "BadRequest");
        F = new eig("BAD_USERNAME", 31, "BadUsername");
        G = new eig("LOGIN_FAIL", 32, "LoginFail");
        H = new eig("NOT_LOGGED_IN", 33, "NotLoggedIn");
        I = new eig("NO_GMAIL", 34, "NoGmail");
        J = new eig("REQUEST_DENIED", 35, "RequestDenied");
        K = new eig("SERVER_ERROR", 36, "ServerError");
        L = new eig("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        M = new eig("DELETED_GMAIL", 38, "DeletedGmail");
        N = new eig("SOCKET_TIMEOUT", 39, "SocketTimeout");
        O = new eig("EXISTING_USERNAME", 40, "ExistingUsername");
        P = new eig("NEEDS_BROWSER", 41, "NeedsBrowser");
        Q = new eig("GPLUS_OTHER", 42, "GPlusOther");
        R = new eig("GPLUS_NICKNAME", 43, "GPlusNickname");
        S = new eig("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        T = new eig("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        U = new eig("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        V = new eig("INVALID_SCOPE", 47, "INVALID_SCOPE");
        X = (new eig[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V
        });
    }
}
